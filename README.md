# wai_mai
外卖订单后端练习项目（Spring Boot 2.7 + MyBatis + MySQL）

## 已实现
- 订单分页查询 GET /orders?page=1&size=10
- 新增订单 POST /orders（单号服务端生成）

## 怎么跑
建库 demooo，改 application.yml 的账号密码，启动 DemoooApplication，端口 8080

## 已知问题
- userId 写死 1003，未接登录
- 单号用时间戳，未做并发去重