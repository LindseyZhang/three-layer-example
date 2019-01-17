CREATE TABLE `product` (
  id int PRIMARY KEY AUTO_INCREMENT COMMENT '产品ID',
  name varchar(50) COMMENT '产品名称',
  price float COMMENT '产品单价'
) DEFAULT CHARSET=utf8;
