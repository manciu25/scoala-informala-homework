package com.JDBC.HW;

import java.sql.*;

/**
 * Class that inserts data in tables and shows the value of the rooms
 */
public class ProcessingMysql {

    public static void insertInto(int i, String type, String bedType, Integer max_guests, String description, int i1, Double value, String season) {
        Integer idAccomodation = null;
        Integer idRoomFair = null;
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "root");

             PreparedStatement ps1 = conn.prepareStatement("insert into accomodation (type,bed_type,max_guests,description) values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
            ps1.setString(1, type);
            ps1.setString(2, bedType);
            ps1.setInt(3, max_guests);
            ps1.setString(4, description);

            ps1.executeUpdate();
            ResultSet res = ps1.getGeneratedKeys();

            while (res.next()) {
                idAccomodation = res.getInt(1);
            }

            PreparedStatement ps2 = conn.prepareStatement("insert into room_fair (value,season) values (?,?)", Statement.RETURN_GENERATED_KEYS);
            {
                ps2.setDouble(1, value);
                ps2.setString(2, season);

                ps2.executeUpdate();
                ResultSet res2 = ps2.getGeneratedKeys();

                while (res2.next()) {
                    idRoomFair = res2.getInt(1);
                }

                PreparedStatement ps3 = conn.prepareStatement("insert into accomodation_fair_relation (id_accomodation,id_room_fair) values (?,?)  ");
                {
                    ps3.setInt(1, idAccomodation);
                    ps3.setInt(2, idRoomFair);
                    ps3.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void roomPrice() {

        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "root");
             PreparedStatement ps = conn.prepareStatement("select id_accomodation,value  from accomodation_fair_relation as acc JOIN room_fair as a on acc.id_room_fair = a.id;");
             ResultSet result = ps.executeQuery()) {
            while (result.next()) {
                System.out.println("id_accomodation:" + result.getInt(1) + " value" + result.getDouble(2));

            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

    }

}