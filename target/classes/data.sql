/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  fahmi
 * Created: Mar 6, 2017
 */
-- 
-- CREATE DATABASE  IF NOT EXISTS `accounts`;
-- USE `accounts`;
--
-- Table structure for table `role`
--

INSERT INTO `role` (id, name) VALUES (1,'ADMIN');
INSERT INTO `role` VALUES (2, 'USER');
INSERT INTO `role` VALUES (3, 'DOCTOR')

insert into `user_account` (id, username, password) values(1, 'fahmi', '$2a$06$2doaOXoMLpjUhiqZoxW6XuTH0HCGr61sMn./rMF2jFsUKV60lh1qG');
-- insert into `user_account` (id, username, password) values(1, 'fahmi', 'fahmi');

insert into `user_account_role` values(1,1);