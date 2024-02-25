-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gameshop
-- ------------------------------------------------------
-- Server version	8.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `games`
--

DROP TABLE IF EXISTS `games`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `games` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `genre` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `price` int DEFAULT NULL,
  `text` varchar(1000) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `games`
--

LOCK TABLES `games` WRITE;
/*!40000 ALTER TABLE `games` DISABLE KEYS */;
INSERT INTO `games` VALUES (1,'어드벤쳐','https://imagestorage9.files.wordpress.com/2023/10/dordogne.jpg',17800,'미미가 되어 어린 시절 소중한 추억과 할머니와 함께 보낸 시간들을 떠올리세요. 과거와 현재가 만나면서 애틋한 어린 시절의 추억을 기반으로 어른으로서의 선택을 하고, 가족의 비밀을 밝히세요. 수천 가지 여름의 색을 직접 수채화로 재현한 도르도뉴를 탐험하세요. 모험을 하며 과거의 순간, 파노라마, 냄새, 소리, 감각을 기억하세요. 미미의 과거를 따라면서 나만의 경험과 향수와 추억을 생생한 기억으로 남긴 일기장을 만드세요.','도르도뉴'),(2,'퍼즐','https://imagestorage9.files.wordpress.com/2023/10/daydream.jpg',17500,'귀여운 테디 베어와 함께 어린아이가 된 플레이어의 마음을 사로잡는 이야기에 빠져보세요. 내면의 평화를 추구하는 동안 어려운 퍼즐을 풀고, 무서운 괴물들에게서 탈출하고, 위험한 함정을 피하세요. 하늘에 떠있는 성들과 바위투성이 동굴들, 동화에서 존재했던 숲과 드넓은 평원들이 가득한 신비로운 세계를 여행해 보세요. 매혹적인 백일몽의 세계에 푹 빠져 회복력의 변화적인 힘과 그만 놓아주는 씁쓸하고 달콤한 아름다움을 발견하세요.','백일몽:잊힌슬픔'),(3,'액션/어드벤쳐','https://imagestorage9.files.wordpress.com/2023/10/metalhellsinger.jpg',10500,'비트에 맞춰 악마를 살육하는 즐거움은 곳곳에 존재하며 필수 히트곡 팩으로 다양한 취향을 모두 맞출 수 있습니다. 전 세계 유명 밴드의 히트곡 8개로 구성된 이 혼합 장르 팩으로 지옥에 뛰어드세요.','메탈:헬싱어'),(4,'롤플레잉','https://imagestorage9.files.wordpress.com/2023/10/elderscrolls.jpg',58000,'타의 추종을 불허하는 스토리텔링과 깊이 있는 세계관을 자랑하는 엘더 스크롤의 세계에서 특별한 모험을 떠나세요. 생생하게 살아 숨 쉬는 방대한 판타지 세계관 탐리엘로 여정을 떠나 나만의 선택으로 빚어 나가는 경험을 직접 마주하세요. 궁수, 마법사, 상인, 학자, 전사 등 여러분 앞에 다채로운 길이 놓여 있습니다. 전투와 전리품 약탈, 제작, 도둑질, 롤플레이를 아우르는 온갖 활동을 즐기세요. 혼자는 물론, 친구들과 함께 플레이할 수 있습니다. 각종 장비와 능력으로 고유한 플레이 방식을 고안해 보세요. 정기 구독할 필요 없이, 한 번 구매하면 언제든 즐길 수 있습니다.','엘더스크롤 온라인:네크롬'),(5,'액션','https://imagestorage9.files.wordpress.com/2023/10/streetfighter.jpg',65000,'시리즈 최신작 『Street Fighter 6(스트리트 파이터 6)』, 2023년 6월 2일 발매 결정! RE ENGINE으로 개발된 본 작품은 지금까지의 시리즈에는 없었던 대형 모드: World Tour, Fighting Ground, Battle Hub로 구성되어 있다. 개성 넘치는 18명의 파이터 류, 춘리, 루크, 제이미, 킴벌리 등, 레전드부터 뉴 제너레이션까지의 파이터가 인상적인 비주얼과 다채로운 기술을 앞세워 지금 이곳에 모였다.','스트리트파이터6'),(6,'어드벤쳐','https://imagestorage9.files.wordpress.com/2023/10/etrianodyssey.jpg',35000,'녹색으로 둘러싸인 걸고 기름진 대지.... 어느 지방에 에트리아라는 작은 마을이 있었다. 그저 평범하기 그지없는 작은 마을은 어느 해의 발견을 계기로 대륙에서 가장 유명한 도시가 된다. \'세계수의 미궁\' 에트리아의 외곽에서 발견된 거대한 대지의 틈새. 땅속 깊숙한 곳까지 이어질 거 같은 심연과 같은 거대한 지하 수해의 미궁....','세계수의미궁 HD리마스터'),(7,'액션','https://imagestorage9.files.wordpress.com/2023/10/endlessdungeon.jpg',31000,'ENDLESS™ Dungeon은 수많은 수상 경력의 ENDLESS™ Universe를 배경으로 선보이는 로그라이트, 전술 액션, 그리고 타워 디펜스의 독특한 결합입니다. 버려진 우주정거장을 혼자서, 또는 친구와 협력하며 탐험하면서 고립된 영웅들로 팀을 꾸리고, 끝없이 몰려 오는 몬스터들의 공세를 상대로 크리스탈을 지켜내세요... 아니면 죽을 때까지 최선을 다해보고, 부활하고, 다시 시도해 보세요.','엔드리스던전'),(8,'시뮬레이션','https://imagestorage9.files.wordpress.com/2023/10/f1manager2023.jpg',51000,'F1 매니저 2023에서 펼쳐지는 Formula 1®의 강렬한 세계를 새로운 시즌과 함께 생생하게 경험해 보세요. 23개의 레이스, 6개의 F1® 스프린트 이벤트, 새로운 차량, 라스베이거스 스트립 서킷이 포함된 새로운 서킷, 새로운 드라이버, 새로운 도전... 여러분의 역사는 바로 여기에서 시작됩니다.','F1 매니저 2023'),(9,'액션','https://imagestorage9.files.wordpress.com/2023/10/remnant2.jpg',53000,'렘넌트 2는 인류의 생존자들이 무시무시한 세계를 활보하며 전에 없던 치명적인 생명체들과 신에 가까운 보스들에 대항하는 내용을 담은 베스트셀러 게임 렘넌트: 프롬 디 애쉬의 속편입니다. 혼자서 혹은 친구 두 명과 협동 플레이를 하면서 깊숙한 미지의 세계를 탐험해 보세요. 현실 그 자체가 악의 손에 파괴되는 것을 막아야 합니다.성공하기 위해 플레이어는 자신과 팀의 능력을 믿고, 힘겨운 도전을 극복하며 인류의 멸종을 막아내야 합니다.','렘넌트2'),(10,'액션','https://imagestorage9.files.wordpress.com/2023/10/exoprimal.jpg',67800,'역사상 가장 흉악한 \'공룡\'을 인류 최강의엑소 슈트\'로 타파하는 팀 대전형 매시브 액션. 본 작품은 \'포지션\'이라고 하는 역할에 특화한 최신예 파워 슈트 \'엑소 슈트\'를 몸에 걸치고, 압도적인 수로 몰려오는 \'공룡 재난\'에 맞서는 온라인 전용 팀 대전형 매시브 액션이다.','엑조프라이멀'),(11,'어드벤쳐','https://imagestorage9.files.wordpress.com/2023/10/afterus-1.jpg',27500,'생명의 정령인 가이아로 플레이하며 추상적인 세계 속 멋진 환경을 탐험하고 멸종된 동물의 혼령을 구해주세요. 작살로 사냥당한 마지막 고래, 새장에 갇힌 마지막 독수리, 사냥당한 마지막 사슴 등 동물들이 어떻게 최후를 맞이했는지 밝혀내면 그들을 살릴 수 있습니다. 하지만 조심하세요. 석유로 뒤덮인 채 불모지를 배회하며 남은 생명을 사냥하는 위험한 포식자들이 도사리고 있습니다.','애프터어스'),(12,'액션','https://imagestorage9.files.wordpress.com/2023/10/raiden3.jpg',32000,'시리즈 첫 3D 작품인 \'라이덴III\'가 새로운 기능을 추가하여 최신 기종으로 부활! 전작을 뛰어넘는 총 28곡을 신규 수록! 모든 스테이지/보스 음악이 게임 센터 미카도 프로듀싱 하에 신규 어레인지로 재탄생한다!','라이덴3'),(14,'어드벤쳐','https://imagestorage9.files.wordpress.com/2023/10/dordogne.jpg',17800,'미미가 되어 어린 시절 소중한 추억과 할머니와 함께 보낸 시간들을 떠올리세요. 과거와 현재가 만나면서 애틋한 어린 시절의 추억을 기반으로 어른으로서의 선택을 하고, 가족의 비밀을 밝히세요. 수천 가지 여름의 색을 직접 수채화로 재현한 도르도뉴를 탐험하세요. 모험을 하며 과거의 순간, 파노라마, 냄새, 소리, 감각을 기억하세요. 미미의 과거를 따라면서 나만의 경험과 향수와 추억을 생생한 기억으로 남긴 일기장을 만드세요.','도르도뉴');
/*!40000 ALTER TABLE `games` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-26  8:12:30
