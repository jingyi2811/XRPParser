package db;

public class Sqlparser {

    public static String getSqlString(String tableName, String[] var){

        String sql = "insert into " + tableName + " values (default,";

        for(int i = 0; i < var.length; i++){
            sql = sql + "'" + var[i] + "',";
        }

        sql = sql.substring(0, sql.length() - 1);

        sql = sql + ")";

        return sql;
    }

}
