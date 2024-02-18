package com.example.datahub_back.data.devTool
import com.example.datahub_back.dto.devTool.*
import java.time.LocalDateTime

val exampleProfile = Profile(1,"주동호","010-7761-8482","launcher37@naver.com","1234")

val exampleProjectMembers = mutableListOf(exampleProfile)

val exampleProject =
    Project(1,
        "학교 관리 웹 사이트",
        "학교를 관리하는 웹 서비스입니다.",
        LocalDateTime.now(),
        LocalDateTime.now(),
        1, 0,
        exampleProjectMembers, exampleProfile);

val exampleProjectList = mutableListOf(exampleProject)


val exampleDataBase = DataBase(1,"학교","학교 정보 데이터베이스",1,0, exampleProject)
val exampleDataBaseList = mutableListOf(exampleDataBase)

//테이블 예시
val exampleTable = Table(1,"학생 테이블","학생들의 정보를 모아둔 테이블", 1,0,exampleDataBase)

val exampleTableList = mutableListOf(exampleTable)

//컬럼 예시
val exampleColumn1 = Column(1,"이름","학생 Table Primary Key","VarChar",1,0,0, exampleTable);
val exampleColumn2= Column(2,"나이","학생 Table 나이","Int",0,0,0,exampleTable);
val exampleColumn3= Column(3,"전화번호","학생 Table 전화번호","VarChar",0,0,0,exampleTable);
val exampleColumn4= Column(4,"주소","학생 Table 주소","VarChar",0,0,0,exampleTable);

val exampleColumnList = mutableListOf(exampleColumn1,exampleColumn2,exampleColumn3,exampleColumn4)

// 데이터 예시
val exampleData1 = Data(1, "홍길동", 1,exampleColumn1)
val exampleData5 = Data(5, "김철수", 2,exampleColumn1)
val exampleData9 = Data(9, "이영희", 3,exampleColumn1)
val exampleData13 = Data(13, "박민수", 4,exampleColumn1)


val exampleData2 = Data(2, "20", 1,exampleColumn2)
val exampleData6 = Data(6, "22", 2,exampleColumn2)
val exampleData10 = Data(10, "21", 3,exampleColumn2)
val exampleData14 = Data(14, "23", 4,exampleColumn2)

val exampleData3 = Data(3, "010-1234-5678", 1,exampleColumn3)
val exampleData7 = Data(7, "010-9876-5432", 2,exampleColumn3)
val exampleData11 = Data(11, "010-5555-4444", 3,exampleColumn3)
val exampleData15 = Data(15, "010-7777-8888", 4,exampleColumn3)

val exampleData4 = Data(4, "서울시 강남구", 1,exampleColumn4)
val exampleData8 = Data(8, "서울시 서초구", 2,exampleColumn4)
val exampleData12 = Data(12, "경기도 고양시", 3,exampleColumn4)
val exampleData16 = Data(16, "인천시 남구", 4,exampleColumn4)

val exampleDataList = mutableListOf(
    exampleData1, exampleData2, exampleData3, exampleData4,
    exampleData5, exampleData6, exampleData7, exampleData8,
    exampleData9, exampleData10, exampleData11, exampleData12,
    exampleData13, exampleData14, exampleData15, exampleData16
)