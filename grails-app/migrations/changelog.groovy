databaseChangeLog = {

    changeSet(author: "eoin (generated)", id: "1561463346889-1") {
        createTable(tableName: "PERSON") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "CONSTRAINT_8")
            }

            column(name: "VERSION", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "ADDRESS", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "AGE", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "NAME", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }
}
