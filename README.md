## shareit 支付系统协议

### 一、自定义

#### 1、业务状态码

状态码 | 含义
---|---
200 | 正常返回
400 | 参数异常，参数不全或者参数类型异常
500 | 系统异常

#### 2、支付系统host
```
dev：http://104.148.71.214:9021
prod： http://pay.ushareit.com
```
### 二、修订记录

版本号| 修订描述 | 修订时间 |  修订人
---|---|---|---
v1.1 | paytm | 2018.01.03 18:41 | 文志伟

### 三、接口

#### 1、创建支付订单

**URL:** domain/pay/preOrder

**请求方式：** POST

**请求参数：**

参数名称 | 参数类型| 是否必填 | 参数描述
---|---|---|---
version | String | 是 | 接口版本 当前v1.0
clientVersion | String | 否 | 客户端版本
userId | String | 是 | 用户ID
payType | int | 是 | 支付类型 0 未知 1 payTm
productId | String | 是 | 商品id
productType | int | 是 | 商品类型 0 未知 1 图片 2 视频 3 音乐 4 充值
productName | String | 是 | 商品名称
currencyType | int | 是 | 货币类型 1 卢比 2 人民币 3 美金
amount | int | 是 | 商品金额（货币类型最小单位）

**返回内容：**

````
{
    "code":200,
    "data":{
               CALLBACK_URL=https: //pguat.paytm.com/paytmchecksum/paytmCallback.jsp,
               CHANNEL_ID=WAP,
               CHECKSUMHASH=FwZ3xLh0/gVpSht2iixlV05hKYSJ4yvx/IRF0DLza+v1QPv6miEjX/ZohOPKKaSfuix26GkZ0URcR6/F5Mz+KbhXu1gk85+JU3gUPP6YQ0E=,
               CUST_ID=CUS-1111,
               EMAIL=test@gmail.com,
               INDUSTRY_TYPE_ID=Retail,
               MID=SHAREI30408276217840,
               MOBILE_NO=13032038911,
               ORDER_ID=USHARE-1514986162370,
               TXN_AMOUNT=2,
               WEBSITE=APP_STAGING
    },
    "message":"success"
}

````


#### 2、支付状态确认

**URL:** domain/callback/paytm

**请求方式：** POST

**请求参数：**

JSON[透传paytm 数据]

**返回内容：**

````
{
    "code":200,
    "data":true
    "message":"success"
}

````

#### 2、订单状态查询

**URL:** domain/pay/getOrderStatus

**请求方式：** POST

**请求参数：**

参数名称 | 参数类型| 是否必填 | 参数描述
---|---|---|---
version | String | 是 | 接口版本 当前v1.0
clientVersion | String | 否 | 客户端版本
userId | String | 是 | 用户ID
orderId | String | 是 | 订单号


**返回内容：**

````
{
    "code":200,
    "data":{
        "status":"1"
    }
    "message":"success"
}

````
### 返回值

| 参数名称 | 参数类型 | 是否必须 | 参数说明 
| :--- | :--- | :--- | :--- 
|status|int|是|订单状态|订单状态 0 待支付 1 支付成功 2 支付失败 3 支付超时 4 退款中 5 退款成功 6 退款失败 7 订单关闭

