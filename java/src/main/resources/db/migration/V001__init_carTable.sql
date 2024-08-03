CREATE TABLE IF NOT EXISTS Car(
    CAR_ID bigserial not null primary key,
    MAKE varchar(20) not null,
    MODEL varchar(20) not null,
    YEAR int not null,
    RANGE_DRIVEN bigint not null,
    LISTED_PRICE bigint,
    PREVIOUS_OWNER int,
    REGISTRATION_NUMBER varchar(8),
    COLOR varchar(20),
    GEARBOX varchar(20),
    DRIVETRAIN varchar(20),
    FUEL varchar(20)
);
