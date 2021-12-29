/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : javaweb

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2021-12-29 23:43:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for attachment
-- ----------------------------
DROP TABLE IF EXISTS `attachment`;
CREATE TABLE `attachment` (
  `attachment_id` varchar(255) NOT NULL,
  `task_id` varchar(255) NOT NULL,
  `attachment_local` varchar(255) DEFAULT NULL,
  `attachment_date` datetime DEFAULT NULL,
  PRIMARY KEY (`attachment_id`),
  KEY `attachment_task_id` (`task_id`),
  CONSTRAINT `attachment_task_id` FOREIGN KEY (`task_id`) REFERENCES `task` (`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attachment
-- ----------------------------

-- ----------------------------
-- Table structure for case
-- ----------------------------
DROP TABLE IF EXISTS `case`;
CREATE TABLE `case` (
  `case_id` varchar(255) NOT NULL,
  `case_name` varchar(255) DEFAULT NULL,
  `course_id` varchar(255) NOT NULL,
  `case_content` varchar(255) DEFAULT NULL,
  `case_type` varchar(255) DEFAULT NULL,
  `case_is_delete` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`case_id`),
  KEY `case_course_id` (`course_id`),
  CONSTRAINT `case_course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of case
-- ----------------------------
INSERT INTO `case` VALUES ('c001', 'cs', 'c111', '这只是个测试案例', 'cs', '否');
INSERT INTO `case` VALUES ('c002', 'JavaWeb课设资料', 'c111', '课设资料', '图片', '否');
INSERT INTO `case` VALUES ('c003', 'JavaWeb课设资料', 'c111', '课设资料', '视频', '否');
INSERT INTO `case` VALUES ('c004', 'JavaWeb课设资料', 'c111', '课设资料', '文档', '否');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` varchar(255) NOT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `course_start_year` varchar(255) DEFAULT NULL,
  `course_is_archive` varchar(255) DEFAULT NULL,
  `teacher_id` varchar(255) NOT NULL,
  PRIMARY KEY (`course_id`),
  KEY `course_teacher_id` (`teacher_id`),
  CONSTRAINT `course_teacher_id` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('c111', 'JavaWeb', '2021', '否', 't321');
INSERT INTO `course` VALUES ('c123', '数据结构', '2021', '是', 't123');
INSERT INTO `course` VALUES ('c321', '离散数学', '2020', '是', 't321');

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `group_id` varchar(255) NOT NULL,
  `group_name` varchar(255) DEFAULT NULL,
  `student_id` varchar(255) DEFAULT NULL,
  `project_id` varchar(255) NOT NULL,
  PRIMARY KEY (`group_id`),
  KEY `group_project_id` (`project_id`),
  KEY `group_student_id` (`student_id`),
  CONSTRAINT `group_project_id` FOREIGN KEY (`project_id`) REFERENCES `project` (`project_id`),
  CONSTRAINT `group_student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group
-- ----------------------------
INSERT INTO `group` VALUES ('g001', 'cs', null, 'p001');
INSERT INTO `group` VALUES ('g002', 'cs', null, 'p002');
INSERT INTO `group` VALUES ('g111', 'SpringBoot', 's191002312', 'p001');
INSERT INTO `group` VALUES ('g123', 'Vue', 's191002313', 'p001');
INSERT INTO `group` VALUES ('gc111p123', 'cs', null, 'p123');

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `project_id` varchar(255) NOT NULL,
  `project_name` varchar(255) DEFAULT NULL,
  `project_introduction` varchar(255) DEFAULT NULL,
  `project_number_limit` int(11) DEFAULT NULL,
  `project_instructions` varchar(255) DEFAULT NULL,
  `course_id` varchar(255) NOT NULL,
  PRIMARY KEY (`project_id`),
  KEY `project_course_id` (`course_id`),
  CONSTRAINT `project_course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('p001', 'JavaWeb课设', '专业实践管理系统', '1', '无', 'c111');
INSERT INTO `project` VALUES ('p002', '数据结构课设', '美团外卖系统', '2', '无', 'c123');
INSERT INTO `project` VALUES ('p123', 'cs', 'cs', '100', 'cs', 'c111');

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `resource_id` varchar(255) NOT NULL,
  `resource_name` varchar(255) DEFAULT NULL,
  `resource_type` varchar(255) DEFAULT NULL,
  `case_id` varchar(255) NOT NULL,
  `resource_local` varchar(255) DEFAULT NULL,
  `resource_date` datetime DEFAULT NULL,
  PRIMARY KEY (`resource_id`),
  KEY `resource_case_id` (`case_id`),
  CONSTRAINT `resource_case_id` FOREIGN KEY (`case_id`) REFERENCES `case` (`case_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource
-- ----------------------------
INSERT INTO `resource` VALUES ('r001', '系统截图', '图片', 'c002', 'usr://', '2021-12-29 10:57:53');
INSERT INTO `resource` VALUES ('r002', '系统演示', '视频', 'c003', 'usr://', '2021-12-08 10:58:33');
INSERT INTO `resource` VALUES ('r003', '系统说明', '文档', 'c004', 'usr://', '2021-12-27 11:01:36');
INSERT INTO `resource` VALUES ('r004', '测试', '文档', 'c004', 'usr://', '2021-12-27 11:01:36');

-- ----------------------------
-- Table structure for sc
-- ----------------------------
DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc` (
  `sc_id` varchar(255) NOT NULL,
  `student_id` varchar(255) NOT NULL,
  `course_id` varchar(255) NOT NULL,
  `sc_is_delete` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sc_id`) USING BTREE,
  KEY `sc_course_id` (`course_id`),
  KEY `sc_student_id` (`student_id`),
  CONSTRAINT `sc_course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`),
  CONSTRAINT `sc_student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sc
-- ----------------------------
INSERT INTO `sc` VALUES ('sc001', 's191002312', 'c123', '否');
INSERT INTO `sc` VALUES ('sc002', 's191002312', 'c111', '否');
INSERT INTO `sc` VALUES ('sc003', 's191002313', 'c321', '否');
INSERT INTO `sc` VALUES ('sc004', 's191002312', 'c321', '否');

-- ----------------------------
-- Table structure for sg
-- ----------------------------
DROP TABLE IF EXISTS `sg`;
CREATE TABLE `sg` (
  `student_id` varchar(255) NOT NULL,
  `group_id` varchar(255) NOT NULL,
  `sg_is_delete` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`student_id`,`group_id`),
  KEY `sg_group_id` (`group_id`),
  CONSTRAINT `sg_group_id` FOREIGN KEY (`group_id`) REFERENCES `group` (`group_id`),
  CONSTRAINT `sg_student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sg
-- ----------------------------
INSERT INTO `sg` VALUES ('s191002312', 'g123', '');
INSERT INTO `sg` VALUES ('s191002313', 'g111', '');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` varchar(255) NOT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `student_sex` varchar(255) DEFAULT NULL,
  `student_phone` varchar(255) DEFAULT NULL,
  `student_major` varchar(255) DEFAULT NULL,
  `student_class` varchar(255) DEFAULT NULL,
  `student_is_delete` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  KEY `student_course_id` (`student_class`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('s191002312', '漆原静乃', '女', '18152508542', '计算机科学与技术', '计算机19-2', '否');
INSERT INTO `student` VALUES ('s191002313', '何润青', '男', '11111111111', '数字媒体', '数媒19-2', '否');

-- ----------------------------
-- Table structure for task
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `task_id` varchar(255) NOT NULL,
  `task_name` varchar(255) DEFAULT NULL,
  `task_details` varchar(255) DEFAULT NULL,
  `task_stage_type` varchar(255) DEFAULT NULL,
  `student_id` varchar(255) NOT NULL,
  `task_start_date` datetime DEFAULT NULL,
  `task_alter_date` datetime DEFAULT NULL,
  `task_type` varchar(255) DEFAULT NULL,
  `task_score` varchar(255) DEFAULT NULL,
  `task_reviews` varchar(255) DEFAULT NULL,
  `task_score_date` datetime DEFAULT NULL,
  `task_start_day` datetime DEFAULT NULL,
  `task_start_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`task_id`),
  KEY `task_student_id` (`student_id`),
  CONSTRAINT `task_student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` varchar(255) NOT NULL,
  `teacher_name` varchar(255) DEFAULT NULL,
  `teacher_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('t123', '孙喆', '131111111111');
INSERT INTO `teacher` VALUES ('t321', 'cold', '999999999999');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(255) NOT NULL,
  `user_pwd` varchar(255) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', '123', '管理员');
INSERT INTO `user` VALUES ('s191002312', '123', '学生');
INSERT INTO `user` VALUES ('s191002313', '123456', '学生');
INSERT INTO `user` VALUES ('t123', '123', '教师');
INSERT INTO `user` VALUES ('t321', '123456', '教师');
