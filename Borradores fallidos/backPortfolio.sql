-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema miPortFolio
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema miPortFolio
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `miPortFolio` DEFAULT CHARACTER SET utf8 ;
USE `miPortFolio` ;

-- -----------------------------------------------------
-- Table `miPortFolio`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`usuarios` (
  `id` INT NOT NULL,
  `nombreUsuario` VARCHAR(45) NOT NULL,
  `claveUsuario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `miPortFolio`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`persona` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `usuarios_id` INT NOT NULL,
  PRIMARY KEY (`id`, `usuarios_id`),
  INDEX `fk_persona_usuarios1_idx` (`usuarios_id` ASC) VISIBLE,
  CONSTRAINT `fk_persona_usuarios1`
    FOREIGN KEY (`usuarios_id`)
    REFERENCES `miPortFolio`.`usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `miPortFolio`.`experiencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`experiencia` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cargo` VARCHAR(45) NOT NULL,
  `empresa` VARCHAR(45) NOT NULL,
  `fechaInicio` DATE NOT NULL,
  `fechaFin` DATE NULL,
  `trabajoActual` TINYINT(1) NULL,
  `persona_id` INT NOT NULL,
  `persona_usuarios_id` INT NOT NULL,
  PRIMARY KEY (`id`, `persona_id`, `persona_usuarios_id`),
  INDEX `fk_experiencia_persona1_idx` (`persona_id` ASC, `persona_usuarios_id` ASC) VISIBLE,
  CONSTRAINT `fk_experiencia_persona1`
    FOREIGN KEY (`persona_id` , `persona_usuarios_id`)
    REFERENCES `miPortFolio`.`persona` (`id` , `usuarios_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `miPortFolio`.`educacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`educacion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `casaEstudios` VARCHAR(45) NOT NULL,
  `fechaInicio` DATE NOT NULL,
  `fechaFin` DATE NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `persona_id` INT NOT NULL,
  `persona_usuarios_id` INT NOT NULL,
  PRIMARY KEY (`id`, `persona_id`, `persona_usuarios_id`),
  INDEX `fk_educacion_persona1_idx` (`persona_id` ASC, `persona_usuarios_id` ASC) VISIBLE,
  CONSTRAINT `fk_educacion_persona1`
    FOREIGN KEY (`persona_id` , `persona_usuarios_id`)
    REFERENCES `miPortFolio`.`persona` (`id` , `usuarios_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `miPortFolio`.`domicilio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`domicilio` (
  `id` INT NOT NULL,
  `calle` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `altura` INT NOT NULL,
  `provincia` VARCHAR(45) NOT NULL,
  `persona_id` INT NOT NULL,
  PRIMARY KEY (`id`, `persona_id`),
  INDEX `fk_domicilio_persona1_idx` (`persona_id` ASC) VISIBLE,
  CONSTRAINT `fk_domicilio_persona1`
    FOREIGN KEY (`persona_id`)
    REFERENCES `miPortFolio`.`persona` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `miPortFolio`.`proyectos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`proyectos` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `fecha` DATE NOT NULL,
  `entidad` VARCHAR(45) NOT NULL,
  `persona_id` INT NOT NULL,
  `persona_usuarios_id` INT NOT NULL,
  PRIMARY KEY (`id`, `persona_id`, `persona_usuarios_id`),
  INDEX `fk_proyectos_persona1_idx` (`persona_id` ASC, `persona_usuarios_id` ASC) VISIBLE,
  CONSTRAINT `fk_proyectos_persona1`
    FOREIGN KEY (`persona_id` , `persona_usuarios_id`)
    REFERENCES `miPortFolio`.`persona` (`id` , `usuarios_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `miPortFolio`.`tecnologias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`tecnologias` (
  `id` INT NOT NULL,
  `tecnologia1` VARCHAR(45) NOT NULL,
  `tecnologia2` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `miPortFolio`.`experiencia_has_proyectos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`experiencia_has_proyectos` (
  `experiencia_id` INT NOT NULL,
  `proyectos_id` INT NOT NULL,
  PRIMARY KEY (`experiencia_id`, `proyectos_id`),
  INDEX `fk_experiencia_has_proyectos_proyectos1_idx` (`proyectos_id` ASC) VISIBLE,
  INDEX `fk_experiencia_has_proyectos_experiencia1_idx` (`experiencia_id` ASC) VISIBLE,
  CONSTRAINT `fk_experiencia_has_proyectos_experiencia1`
    FOREIGN KEY (`experiencia_id`)
    REFERENCES `miPortFolio`.`experiencia` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_experiencia_has_proyectos_proyectos1`
    FOREIGN KEY (`proyectos_id`)
    REFERENCES `miPortFolio`.`proyectos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `miPortFolio`.`experiencia_has_proyectos1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`experiencia_has_proyectos1` (
  `experiencia_id` INT NOT NULL,
  `experiencia_persona_id` INT NOT NULL,
  `experiencia_persona_usuarios_id` INT NOT NULL,
  `proyectos_id` INT NOT NULL,
  PRIMARY KEY (`experiencia_id`, `experiencia_persona_id`, `experiencia_persona_usuarios_id`, `proyectos_id`),
  INDEX `fk_experiencia_has_proyectos1_proyectos1_idx` (`proyectos_id` ASC) VISIBLE,
  INDEX `fk_experiencia_has_proyectos1_experiencia1_idx` (`experiencia_id` ASC, `experiencia_persona_id` ASC, `experiencia_persona_usuarios_id` ASC) VISIBLE,
  CONSTRAINT `fk_experiencia_has_proyectos1_experiencia1`
    FOREIGN KEY (`experiencia_id` , `experiencia_persona_id` , `experiencia_persona_usuarios_id`)
    REFERENCES `miPortFolio`.`experiencia` (`id` , `persona_id` , `persona_usuarios_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_experiencia_has_proyectos1_proyectos1`
    FOREIGN KEY (`proyectos_id`)
    REFERENCES `miPortFolio`.`proyectos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `miPortFolio`.`proyectos_has_tecnologias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miPortFolio`.`proyectos_has_tecnologias` (
  `proyectos_id` INT NOT NULL,
  `proyectos_persona_id` INT NOT NULL,
  `proyectos_persona_usuarios_id` INT NOT NULL,
  `tecnologias_id` INT NOT NULL,
  PRIMARY KEY (`proyectos_id`, `proyectos_persona_id`, `proyectos_persona_usuarios_id`, `tecnologias_id`),
  INDEX `fk_proyectos_has_tecnologías_tecnologías1_idx` (`tecnologias_id` ASC) VISIBLE,
  INDEX `fk_proyectos_has_tecnologías_proyectos1_idx` (`proyectos_id` ASC, `proyectos_persona_id` ASC, `proyectos_persona_usuarios_id` ASC) VISIBLE,
  CONSTRAINT `fk_proyectos_has_tecnologías_proyectos1`
    FOREIGN KEY (`proyectos_id` , `proyectos_persona_id` , `proyectos_persona_usuarios_id`)
    REFERENCES `miPortFolio`.`proyectos` (`id` , `persona_id` , `persona_usuarios_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_proyectos_has_tecnologías_tecnologías1`
    FOREIGN KEY (`tecnologias_id`)
    REFERENCES `miPortFolio`.`tecnologias` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
