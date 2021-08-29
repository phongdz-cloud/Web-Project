CREATE TABLE product(
                        id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT,
                        nameproduct varchar(255) NULl,
                        imageproduct varchar(255) NULL,
                        title varchar(255) ,
                        description TEXT NOT NULL,
                        price int NOT NULL,
                        categoryid bigint NOT NULL,
                        createddate TIMESTAMP NULL,
                        modifieddate TIMESTAMP NULL,
                        createdby	VARCHAR(255) NULL,
                        modifiedby VARCHAR(255) NULL
);

CREATE TABLE category(
                         id bigint NOT NULL PRIMARY KEY auto_increment,
                         name VARCHAR(255) NOT NULL,
                         code VARCHAR(255) NOT NULL,
                         createddate TIMESTAMP NULL,
                         modifieddate TIMESTAMP NULL,
                         createdby	VARCHAR(255) NULL,
                         modifiedby VARCHAR(255) NULL

);
ALTER TABLE product ADD CONSTRAINT fk_product_category FOREIGN KEY (categoryid) REFERENCES category(id);

CREATE TABLE customersale(
                             id bigint NOT NULL PRIMARY KEY auto_increment,
                             user_id bigint NOT NULL,
                             product_id bigint not null,
                             createddate TIMESTAMP NULL,
                             modifieddate TIMESTAMP NULL,
                             createdby	VARCHAR(255) NULL,
                             modifiedby VARCHAR(255) NULL
);
ALTER TABLE customersale ADD CONSTRAINT fk_customersale_user FOREIGN KEY (user_id) REFERENCES user(id);
ALTER TABLE customersale ADD CONSTRAINT fk_customer_product FOREIGN KEY (product_id) REFERENCES product(id);
