CREATE TABLE `product` (
  id int PRIMARY KEY AUTO_INCREMENT COMMENT '产品ID',
  name varchar(50) COMMENT '产品名称',
  price float COMMENT '产品单价'
) DEFAULT CHARSET=utf8;

INSERT INTO `product` (`name`, `price`) VALUES ('wahaha', 3);
INSERT INTO `product` (`name`, `price`) VALUES ('shuangwaiwai', 4);
INSERT INTO `product` (`name`, `price`) VALUES ('iPhone XR', 8000);
INSERT INTO `product` (`name`, `price`) VALUES ('coke', 5);
INSERT INTO `product` (`name`, `price`) VALUES ('lays', 8);
INSERT INTO `product` (`name`, `price`) VALUES ('burger king', 35);
INSERT INTO `product` (`name`, `price`) VALUES ('iPad', 1399);