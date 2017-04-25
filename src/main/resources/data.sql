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

-- insert into `patient` values (1, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (2, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (3, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (4, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (5, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (6, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (7, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (8, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (9, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (10, 'fahmi', 'malang', '08123098439535');
-- 
-- insert into `patient` values (11, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (12, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (13, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (14, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (15, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (16, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (17, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (18, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (19, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (20, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (21, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (22, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (23, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (24, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (25, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (26, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (27, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (28, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (29, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (30, 'fahmi', 'malang', '08123098439535');
-- 
-- 
-- insert into `patient` values (31, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (32, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (33, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (34, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (35, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (36, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (37, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (38, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (39, 'fahmi', 'malang', '08123098439535');
-- insert into `patient` values (40, 'fahmi', 'malang', '08123098439535');
-- 
-- insert into `patient` values (41, 'fahmi', 'malang', '08124098549545');
-- insert into `patient` values (42, 'fahmi', 'malang', '08124098549545');
-- insert into `patient` values (43, 'fahmi', 'malang', '08124098549545');
-- insert into `patient` values (44, 'fahmi', 'malang', '08124098549545');
-- insert into `patient` values (45, 'fahmi', 'malang', '08124098549545');
-- insert into `patient` values (46, 'fahmi', 'malang', '08124098549545');
-- insert into `patient` values (47, 'fahmi', 'malang', '08124098549545');
-- insert into `patient` values (48, 'fahmi', 'malang', '08124098549545');
-- insert into `patient` values (49, 'fahmi', 'malang', '08124098549545');
-- insert into `patient` values (50, 'fahmi', 'malang', '08124098549545');
-- 
-- insert into `patient` values (51, 'fahmi', 'malang', '08125098559555');
-- insert into `patient` values (52, 'fahmi', 'malang', '08125098559555');
-- insert into `patient` values (53, 'fahmi', 'malang', '08125098559555');
-- insert into `patient` values (54, 'fahmi', 'malang', '08125098559555');
-- insert into `patient` values (55, 'fahmi', 'malang', '08125098559555');
-- insert into `patient` values (56, 'fahmi', 'malang', '08125098559555');
-- insert into `patient` values (57, 'fahmi', 'malang', '08125098559555');
-- insert into `patient` values (58, 'fahmi', 'malang', '08125098559555');
-- insert into `patient` values (59, 'fahmi', 'malang', '08125098559555');
-- insert into `patient` values (60, 'fahmi', 'malang', '08125098559555');
-- 
-- 
-- insert into `patient` values (61, 'fahmi', 'malang', '08126098669666');
-- insert into `patient` values (62, 'fahmi', 'malang', '08126098669666');
-- insert into `patient` values (63, 'fahmi', 'malang', '08126098669666');
-- insert into `patient` values (64, 'fahmi', 'malang', '08126098669666');
-- insert into `patient` values (65, 'fahmi', 'malang', '08126098669666');
-- insert into `patient` values (66, 'fahmi', 'malang', '08126098669666');
-- insert into `patient` values (67, 'fahmi', 'malang', '08126098669666');
-- insert into `patient` values (68, 'fahmi', 'malang', '08126098669666');
-- insert into `patient` values (69, 'fahmi', 'malang', '08126098669666');
-- insert into `patient` values (70, 'fahmi', 'malang', '08126098669666');
-- 
-- insert into `patient` values (71, 'fahmi', 'malang', '08127098779777');
-- insert into `patient` values (72, 'fahmi', 'malang', '08127098779777');
-- insert into `patient` values (73, 'fahmi', 'malang', '08127098779777');
-- insert into `patient` values (74, 'fahmi', 'malang', '08127098779777');
-- insert into `patient` values (75, 'fahmi', 'malang', '08127098779777');
-- insert into `patient` values (76, 'fahmi', 'malang', '08127098779777');
-- insert into `patient` values (77, 'fahmi', 'malang', '08127098779777');
-- insert into `patient` values (78, 'fahmi', 'malang', '08127098779777');
-- insert into `patient` values (79, 'fahmi', 'malang', '08127098779777');
-- insert into `patient` values (70, 'fahmi', 'malang', '08127098779777');