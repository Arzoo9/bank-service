CREATE TABLE `bank_service`.`new_table` (
  `id` VARCHAR(25) NOT NULL,
  `type` VARCHAR(45) NULL,
  `fromAccountNumber` VARCHAR(45) NULL,
  `toAccountNumber` VARCHAR(45) NULL,
  `totalBalance` VARCHAR(45) NULL,
  `accountTypeCode` VARCHAR(45) NULL,
  `status` VARCHAR(45) NULL,
  `accountNumber` VARCHAR(45) NULL,
  `date` DATE NULL,
  PRIMARY KEY (`id`));