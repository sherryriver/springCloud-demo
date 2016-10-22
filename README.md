# springCloud-demo

自己搭建的一个基于springCloud微服务的平台demo

> * eureka-service是注册中心 并实现高可用
> * compute-service是服务提供方
> * eureka-ribbon 是服务消费方 使用ribbon客户端负载均衡并且引入Hystrix做断路器
> * api-filter是通过zuul实现的服务网关

更多介绍可以移步：
[springCloud-demo的搭建](http://sherryriver.com/2016/08/26/springCloud搭建/)

