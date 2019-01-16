CREATE TABLE `product` (
  id varchar(10) PRIMARY KEY COMMENT '产品ID',
  name varchar(50) COMMENT '产品名称',
  price float COMMENT '产品单价'
) DEFAULT CHARSET=utf8;