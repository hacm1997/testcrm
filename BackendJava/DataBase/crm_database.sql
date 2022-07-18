-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         5.7.33 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Volcando datos para la tabla crm_database.auth_group: ~0 rows (aproximadamente)
DELETE FROM `auth_group`;
/*!40000 ALTER TABLE `auth_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `auth_group` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.auth_group_permissions: ~0 rows (aproximadamente)
DELETE FROM `auth_group_permissions`;
/*!40000 ALTER TABLE `auth_group_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `auth_group_permissions` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.auth_permission: ~32 rows (aproximadamente)
DELETE FROM `auth_permission`;
/*!40000 ALTER TABLE `auth_permission` DISABLE KEYS */;
INSERT INTO `auth_permission` (`id`, `name`, `content_type_id`, `codename`) VALUES
	(1, 'Can add log entry', 1, 'add_logentry'),
	(2, 'Can change log entry', 1, 'change_logentry'),
	(3, 'Can delete log entry', 1, 'delete_logentry'),
	(4, 'Can view log entry', 1, 'view_logentry'),
	(5, 'Can add permission', 2, 'add_permission'),
	(6, 'Can change permission', 2, 'change_permission'),
	(7, 'Can delete permission', 2, 'delete_permission'),
	(8, 'Can view permission', 2, 'view_permission'),
	(9, 'Can add group', 3, 'add_group'),
	(10, 'Can change group', 3, 'change_group'),
	(11, 'Can delete group', 3, 'delete_group'),
	(12, 'Can view group', 3, 'view_group'),
	(13, 'Can add user', 4, 'add_user'),
	(14, 'Can change user', 4, 'change_user'),
	(15, 'Can delete user', 4, 'delete_user'),
	(16, 'Can view user', 4, 'view_user'),
	(17, 'Can add content type', 5, 'add_contenttype'),
	(18, 'Can change content type', 5, 'change_contenttype'),
	(19, 'Can delete content type', 5, 'delete_contenttype'),
	(20, 'Can view content type', 5, 'view_contenttype'),
	(21, 'Can add session', 6, 'add_session'),
	(22, 'Can change session', 6, 'change_session'),
	(23, 'Can delete session', 6, 'delete_session'),
	(24, 'Can view session', 6, 'view_session'),
	(25, 'Can add clients', 7, 'add_clients'),
	(26, 'Can change clients', 7, 'change_clients'),
	(27, 'Can delete clients', 7, 'delete_clients'),
	(28, 'Can view clients', 7, 'view_clients'),
	(29, 'Can add type', 8, 'add_type'),
	(30, 'Can change type', 8, 'change_type'),
	(31, 'Can delete type', 8, 'delete_type'),
	(32, 'Can view type', 8, 'view_type');
/*!40000 ALTER TABLE `auth_permission` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.auth_user: ~0 rows (aproximadamente)
DELETE FROM `auth_user`;
/*!40000 ALTER TABLE `auth_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `auth_user` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.auth_user_groups: ~0 rows (aproximadamente)
DELETE FROM `auth_user_groups`;
/*!40000 ALTER TABLE `auth_user_groups` DISABLE KEYS */;
/*!40000 ALTER TABLE `auth_user_groups` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.auth_user_user_permissions: ~0 rows (aproximadamente)
DELETE FROM `auth_user_user_permissions`;
/*!40000 ALTER TABLE `auth_user_user_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `auth_user_user_permissions` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.clients_clients: ~5 rows (aproximadamente)
DELETE FROM `clients_clients`;
/*!40000 ALTER TABLE `clients_clients` DISABLE KEYS */;
INSERT INTO `clients_clients` (`id`, `cc`, `name`, `last_name`, `email`, `cell_phone`, `birthday`, `address`, `tipy_contract`, `origen`, `type_id`) VALUES
	(1, 123456, 'Heiner', 'Acosta Silgado', 'hh@gmail.com', '300624', '2022-06-08 05:00:00.000000', '13 de junio', 'Cliente', 'LA', NULL),
	(3, 985145, 'Fernando', 'Nat', 'ferl@gmail.com', '313452145', '2000-11-29 00:00:00.000000', 'Parque bolívar', 'Cliente', 'LA', NULL),
	(8, 12456, 'Kea', 'Rua', 'rua@gmail.com', '31151202', '2022-06-16 05:00:00.000000', 'Armenia', 'Cliente', 'LB', NULL),
	(9, 98215, 'Manuel', 'Osorio Herrera', 'maneosoriohe@gmail.com', '301624540', '1997-06-14 00:00:00.000000', 'Zarabanda', 'Cliente', 'LC', NULL),
	(13, 93759834, 'Cristian', 'Pizon', 'cris@gmail.com', '3254697', '2022-07-02 00:00:00.000000', 'Pozón', 'Cliente', 'LB', NULL);
/*!40000 ALTER TABLE `clients_clients` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.django_admin_log: ~0 rows (aproximadamente)
DELETE FROM `django_admin_log`;
/*!40000 ALTER TABLE `django_admin_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `django_admin_log` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.django_content_type: ~8 rows (aproximadamente)
DELETE FROM `django_content_type`;
/*!40000 ALTER TABLE `django_content_type` DISABLE KEYS */;
INSERT INTO `django_content_type` (`id`, `app_label`, `model`) VALUES
	(1, 'admin', 'logentry'),
	(3, 'auth', 'group'),
	(2, 'auth', 'permission'),
	(4, 'auth', 'user'),
	(7, 'clients', 'clients'),
	(5, 'contenttypes', 'contenttype'),
	(8, 'restapi', 'type'),
	(6, 'sessions', 'session');
/*!40000 ALTER TABLE `django_content_type` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.django_migrations: ~20 rows (aproximadamente)
DELETE FROM `django_migrations`;
/*!40000 ALTER TABLE `django_migrations` DISABLE KEYS */;
INSERT INTO `django_migrations` (`id`, `app`, `name`, `applied`) VALUES
	(1, 'contenttypes', '0001_initial', '2022-06-26 03:25:42.703538'),
	(2, 'auth', '0001_initial', '2022-06-26 03:25:43.487350'),
	(3, 'admin', '0001_initial', '2022-06-26 03:25:43.663647'),
	(4, 'admin', '0002_logentry_remove_auto_add', '2022-06-26 03:25:43.679646'),
	(5, 'admin', '0003_logentry_add_action_flag_choices', '2022-06-26 03:25:43.693650'),
	(6, 'contenttypes', '0002_remove_content_type_name', '2022-06-26 03:25:43.835258'),
	(7, 'auth', '0002_alter_permission_name_max_length', '2022-06-26 03:25:43.865264'),
	(8, 'auth', '0003_alter_user_email_max_length', '2022-06-26 03:25:43.895316'),
	(9, 'auth', '0004_alter_user_username_opts', '2022-06-26 03:25:43.911960'),
	(10, 'auth', '0005_alter_user_last_login_null', '2022-06-26 03:25:43.974488'),
	(11, 'auth', '0006_require_contenttypes_0002', '2022-06-26 03:25:43.978488'),
	(12, 'auth', '0007_alter_validators_add_error_messages', '2022-06-26 03:25:43.992730'),
	(13, 'auth', '0008_alter_user_username_max_length', '2022-06-26 03:25:44.021382'),
	(14, 'auth', '0009_alter_user_last_name_max_length', '2022-06-26 03:25:44.048109'),
	(15, 'auth', '0010_alter_group_name_max_length', '2022-06-26 03:25:44.082117'),
	(16, 'auth', '0011_update_proxy_permissions', '2022-06-26 03:25:44.099000'),
	(17, 'auth', '0012_alter_user_first_name_max_length', '2022-06-26 03:25:44.128992'),
	(18, 'restapi', '0001_initial', '2022-06-26 03:25:44.165990'),
	(19, 'clients', '0001_initial', '2022-06-26 03:25:44.257929'),
	(20, 'sessions', '0001_initial', '2022-06-26 03:25:44.330289');
/*!40000 ALTER TABLE `django_migrations` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.django_session: ~0 rows (aproximadamente)
DELETE FROM `django_session`;
/*!40000 ALTER TABLE `django_session` DISABLE KEYS */;
/*!40000 ALTER TABLE `django_session` ENABLE KEYS */;

-- Volcando datos para la tabla crm_database.restapi_type: ~0 rows (aproximadamente)
DELETE FROM `restapi_type`;
/*!40000 ALTER TABLE `restapi_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `restapi_type` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
