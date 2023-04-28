# cyber-core



#### 1、核心的基础模型，包含了业务对象的基础模型，通用的请求对象模型，通用的请求返回基础模型

<img width="562" alt="image" src="https://user-images.githubusercontent.com/29422590/235084627-3a5f7842-1cbe-48d0-97cd-f7a6d886a03b.png">




#### 2、常用的基础工具

| **公共库**    | **功能说明**     | **版本**     | **备注** |
| ------------- | ---------------- | ------------ | -------- |
| fastjson      | json对象操作     | 2.0.16.graal |          |
| guava         | 常用工具（缓存） | 31.1-jre     |          |
| jjwt          | JWT处理工具      | 0.10.6       |          |
| okhttp3       | http客户端       | 4.10.0       |          |
| commons-lang3 | 常用工具         | 3.12.0       |          |



#### 3、常用的基础公共库

| **方法**          | **功能说明**             | **备注** |
| ----------------- | ------------------------ | -------- |
| OkHttpAsyExecutor | http异步调用             |          |
| Responses         | http返回对象             |          |
| ThreadLocals      | 线程变量，主要是会话信息 |          |
| UUIDs             | 短uuid生成               |          |
