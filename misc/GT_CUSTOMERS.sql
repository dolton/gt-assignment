CREATE TABLE USER_TEST_GT.GT_CUSTOMERS (
	ID NUMBER(10,0),
	FIRST_NAME VARCHAR2(255),
	LAST_NAME VARCHAR2(255),
	EMAIL VARCHAR2(255),
	GENDER VARCHAR2(255),
	MOBILE_NO NUMBER(10,0),
	CONSTRAINT GT_CUSTOMERS_PK_ID PRIMARY KEY (ID)
);


INSERT INTO GT_CUSTOMERS (ID,FIRST_NAME,LAST_NAME,EMAIL,GENDER,MOBILE_NO) VALUES 
(1,'John','Doe','john@doe.com','Male',909098989)
,(2,'Charlie','Austin','charlie@doe.com','Male',909098989)
,(3,'Dexter','Sosa','dexter@doe.com','Male',909098989)
,(4,'Mary','Lee','mary@lee.com','Female',980980989)
,(5,'Martin','Luther','martin@lee.com','Male',980980989)
,(6,'Sudha','Murthy','sudha.m@lee.com','Female',980980989)
,(7,'Narayan','Murthy','narayan.m@lee.com','Male',980980989)
;