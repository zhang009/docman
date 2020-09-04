CREATE DATABASE `docman_man` /*!40100 DEFAULT CHARACTER SET utf8 */

-- we don't know how to generate schema docman_man (class Schema) :(
create table l_doc_attachment
(
	id bigint not null comment '系统id'
		primary key,
	created datetime not null comment '创建时间',
	modified datetime not null on update CURRENT_TIMESTAMP comment '上次修改时间',
	is_enable tinyint(1) default '1' not null comment '是否有效:1.有效,2.无效',
	attachment_id bigint not null comment '附件ID',
	doc_id varchar(50) not null comment '档案ID'
)
comment '档案附件表' charset=utf8mb4
;

create table sequence_value
(
	id bigint default '0' not null,
	name varchar(50) not null,
	constraint sequence_value_name_uindex
		unique (name)
)
;

create table t_attachment
(
	id bigint not null comment '系统id'
		primary key,
	created datetime not null comment '创建时间',
	modified datetime not null on update CURRENT_TIMESTAMP comment '上次修改时间',
	is_enable tinyint(1) default '1' not null comment '是否有效:1.有效,2.无效',
	file_name varchar(255) not null comment '附件名称',
	file_size bigint not null comment '附件大小',
	file_extension varchar(20) not null comment '附件扩展名',
	file_hash varchar(64) not null comment '附件hash码',
	reference_count int default '0' not null comment '引用计数'
)
comment '附件表' charset=utf8mb4
;

create table t_box
(
	id bigint not null comment '系统id'
		primary key,
	created datetime not null comment '创建时间',
	modified datetime not null on update CURRENT_TIMESTAMP comment '上次修改时间',
	is_enable tinyint(1) default '1' not null comment '是否有效:1.有效,2.无效',
	box_code varchar(100) not null comment '盒号',
	department_id int default '-1' null comment '所属部门:-1.未知',
	department_name varchar(60) default '' null comment '所属部门名称',
	doc_count int default '0' null comment '档案件数',
	vol_count int default '0' null comment '案卷件数',
	page_count int default '0' null comment '文件页数',
	collating_date date null comment '整理日期',
	collating_staff_id bigint null comment '整理人ID:-1.未知',
	collating_staff_name varchar(20) null comment '整理人名称',
	storage_place varchar(200) null comment '存放地点',
	memo varchar(1000) null comment '备注',
	belong_state tinyint default '-1' not null comment '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属盒,3.归属案卷',
	belong_type tinyint default '-1' not null comment '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属案卷,3.归属盒',
	classfy_id int default '-1' null comment '分类号:-1.未知',
	classfy_name varchar(200) default '' null comment '分类名称',
	category_id int not null comment '档案类目ID:-1.未知,1.文书档案,2.项目档案,3.工程档案,4.照片档案,5.资料库,6.实物档案,7.业务档案,8.科技档案,9.涉密档案,10.合同档案,11.会计档案,12.音视频档案'
)
comment '盒表' charset=utf8mb4
;

create table t_classfy
(
	id bigint not null comment '系统id'
		primary key,
	created datetime not null comment '创建时间',
	modified datetime not null on update CURRENT_TIMESTAMP comment '上次修改时间',
	is_enable tinyint(1) default '1' not null comment '是否有效:1.有效,2.无效',
	classfy_name varchar(200) default '' not null comment '分类名称',
	parent_id int not null comment '父级ID:0为顶级',
	category_id int not null comment '档案类目ID:-1.未知,1.文书档案,2.项目档案,3.工程档案,4.照片档案,5.资料库,6.实物档案,7.业务档案,8.科技档案,9.涉密档案,10.合同档案,11.会计档案,12.音视频档案'
)
comment '分类表' charset=utf8mb4
;

create table t_doc
(
	id bigint not null comment '系统id'
		primary key,
	created datetime not null comment '创建时间',
	modified datetime not null on update CURRENT_TIMESTAMP comment '上次修改时间',
	is_enable tinyint(1) default '1' not null comment '是否有效:1.有效,2.无效',
	doc_id varchar(50) not null comment '文件档号',
	year year not null comment '年度',
	doc_name varchar(200) default '' not null comment '文件题名',
	classfy_id int default '-1' null comment '分类号:-1.未知',
	classfy_name varchar(200) default '' null comment '分类名称',
	doc_code varchar(50) null comment '件号',
	department_id int default '-1' null comment '所属部门:-1.未知',
	department_name varchar(60) default '' null comment '所属部门名称',
	doc_date date null comment '成文日期',
	doc_pub_code varchar(50) null comment '文号',
	doc_pub_type tinyint default '0' null comment '文件类型:-1.未知,1.发文,2.收文,3.签报',
	receive_doc_id varchar(100) null comment '收文登记号',
	issued_company varchar(100) null comment '发文主送单位',
	copy_company varchar(100) null comment '发文抄送单位',
	page_count int default '0' null comment '文件页数',
	receive_doc_pub_code varchar(100) null comment '来问文号',
	receive_doc_code varchar(100) null comment '收文编号',
	doc_step_type int default '1' null comment '稿本:-1.未知,1.草稿,2.定稿,3.手稿,4.草图,5.原图,6.地图,7.蓝图,8.正文,9.副本,10.原版,11.试行本,12.修订本,13.影视本,14.文字本',
	filing_department int default '-1' null comment '归档部门:-1.未知',
	filing_staff_name varchar(20) null comment '归档人',
	filing_date date null comment '归档日期',
	filing_count int default '0' null comment '归档份数',
	memo varchar(1000) null comment '备注',
	box varchar(100) null comment '盒号',
	attachment_count int default '0' null comment '附件个数',
	belong_state tinyint default '-1' not null comment '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属盒,3.归属案卷',
	belong_type tinyint default '-1' not null comment '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属案卷,3.归属盒',
	category_id int not null comment '档案类目ID:-1.未知,1.文书档案,2.项目档案,3.工程档案,4.照片档案,5.资料库,6.实物档案,7.业务档案,8.科技档案,9.涉密档案,10.合同档案,11.会计档案,12.音视频档案'
)
comment '文件表' charset=utf8mb4
;

create table t_projcet
(
	id bigint not null comment '系统id'
		primary key,
	created datetime not null comment '创建时间',
	modified datetime not null on update CURRENT_TIMESTAMP comment '上次修改时间',
	is_enable tinyint(1) default '1' not null comment '是否有效:1.有效,2.无效',
	project_name varchar(200) not null comment '项目名称',
	project_code varchar(100) null comment '项目代号',
	department_id int default '-1' null comment '所属部门:-1.未知',
	department_name varchar(60) default '' null comment '所属部门名称',
	project_approval_year year null comment '立项年度',
	project_approval_date date null comment '立项日期',
	project_acceptance_date date null comment '初验日期',
	project_completion_year year null comment '竣工年度',
	project_completion_date date null comment '竣工日期',
	filing_year year null comment '归档年度',
	filing_date date null comment '归档日期',
	company varchar(100) null comment '归属单位',
	company_design varchar(100) null comment '设计单位',
	company_construction varchar(100) null comment '施工单位',
	company_supervision varchar(100) null comment '监理单位',
	project_intro varchar(1000) null comment '项目介绍',
	memo varchar(1000) null comment '备注',
	classfy_id int default '-1' null comment '分类号:-1.未知',
	classfy_name varchar(200) default '' null comment '分类名称',
	category_id int not null comment '档案类目ID:-1.未知,1.文书档案,2.项目档案,3.工程档案,4.照片档案,5.资料库,6.实物档案,7.业务档案,8.科技档案,9.涉密档案,10.合同档案,11.会计档案,12.音视频档案'
)
comment '项目表' charset=utf8mb4
;

create table t_vol
(
	id bigint not null comment '系统id'
		primary key,
	created datetime not null comment '创建时间',
	modified datetime not null on update CURRENT_TIMESTAMP comment '上次修改时间',
	is_enable tinyint(1) default '1' not null comment '是否有效:1.有效,2.无效',
	vol_name varchar(200) not null comment '案卷题名',
	vol_code varchar(100) null comment '案卷代号',
	project_code varchar(100) null comment '项目代号',
	catalog_code varchar(100) null comment '目录号',
	vol_filing_code varchar(100) null comment '案卷档号',
	department_id int default '-1' null comment '所属部门:-1.未知',
	department_name varchar(60) default '' null comment '所属部门名称',
	year year null comment '年度',
	doc_count int default '0' null comment '件数',
	page_count int default '0' null comment '文件页数',
	date_start date null comment '起始日期',
	date_end date null comment '截止日期',
	filing_department int default '-1' null comment '归档部门:-1.未知',
	filing_staff_name varchar(20) null comment '归档人',
	filing_date date null comment '归档日期',
	filing_count int default '0' null comment '归档份数',
	memo varchar(1000) null comment '备注',
	compile_company varchar(200) null comment '编制单位',
	compile_date date null comment '编制日期',
	belong_state tinyint default '-1' not null comment '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属盒,3.归属案卷',
	belong_type tinyint default '-1' not null comment '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属案卷,3.归属盒',
	classfy_id int default '-1' null comment '分类号:-1.未知',
	classfy_name varchar(200) default '' null comment '分类名称',
	category_id int not null comment '档案类目ID:-1.未知,1.文书档案,2.项目档案,3.工程档案,4.照片档案,5.资料库,6.实物档案,7.业务档案,8.科技档案,9.涉密档案,10.合同档案,11.会计档案,12.音视频档案'
)
comment '案卷表' charset=utf8mb4
;

