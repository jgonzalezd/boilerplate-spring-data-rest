CREATE TABLE IF NOT EXISTS profile (
  id INT AUTO_INCREMENT,
  name VARCHAR(150) NOT NULL,
  birthday DATE NOT NULL,
  profession VARCHAR(150) NOT NULL,
  Job VARCHAR(150) NOT NULL,
  gender TINYINT NOT NULL,
  gender_of_interest tinyint,
  PRIMARY KEY (id));