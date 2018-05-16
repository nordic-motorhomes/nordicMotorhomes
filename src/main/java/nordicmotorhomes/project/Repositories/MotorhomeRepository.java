package nordicmotorhomes.project.Repositories;

import nordicmotorhomes.project.Model.Motorhome;
import nordicmotorhomes.project.Repositories.Util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MotorhomeRepository implements ICrudRepository<Motorhome> {

    private Connection conn;
    private PreparedStatement preparedStatement;
    private ResultSet result;

    public MotorhomeRepository() {
        this.conn = DbConnection.getConnection();
    }

    @Override
    public ArrayList<Motorhome> readAll() {
        ArrayList<Motorhome> motorhomes = new ArrayList<>();
        try {
            preparedStatement = conn.prepareStatement("SELECT * FROM motorhomes");
            result = preparedStatement.executeQuery();

            while (result.next()) {
                motorhomes.add(new Motorhome(result.getInt("MotorhomesID"), result.getString("Status"), result.getString("Model"), result.getInt("sleepingPlaces"), result.getString("Length"), result.getString("Width"), result.getString("Height"), result.getString("Engine"), result.getString("PermissibleWeight")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return motorhomes;
    }

    @Override
    public Motorhome read(int motorhomeId) {
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM motorhomes WHERE MotorhomesID=?");
            preparedStatement.setInt(1, motorhomeId);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            return new Motorhome(
                    resultSet.getInt("MotorhomesId"),
                    resultSet.getString("Status"),
                    resultSet.getString("Model"),
                    resultSet.getInt("sleepingPlaces"),
                    resultSet.getString("Length"),
                    resultSet.getString("Width"),
                    resultSet.getString("Height"),
                    resultSet.getString("Engine"),
                    resultSet.getString("PermissibleWeight"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void create(Motorhome obj) {
        try {
            preparedStatement = conn.prepareStatement("INSERT INTO motorhomes(MotorhomesID, Status, Model, sleepingPlaces, Length, Width, Height, Engine, PermissibleWeight) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1,obj.getMotorhomeId());
            preparedStatement.setString(2,obj.getStatus());
            preparedStatement.setString(3,obj.getModel());
            preparedStatement.setInt(4, obj.getSleepingPlaces());
            preparedStatement.setString(5,obj.getLength());
            preparedStatement.setString(6,obj.getWidth());
            preparedStatement.setString(7,obj.getHeight());
            preparedStatement.setString(8,obj.getEngine());
            preparedStatement.setString(9,obj.getPermissibleWeight());
            preparedStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Motorhome obj) {

        try {
            preparedStatement = conn.prepareStatement("UPDATE motorhomes SET Status = ?, Model = ?, sleepingPlaces = ?, Length = ?, Width = ?, Height = ?, Engine = ?, PermissibleWeight = ? WHERE MotorhomesID = ? ");
            preparedStatement.setString(1, obj.getStatus());
            preparedStatement.setString(2, obj.getModel());
            preparedStatement.setInt(3, obj.getSleepingPlaces());
            preparedStatement.setString(4, obj.getLength());
            preparedStatement.setString(5, obj.getWidth());
            preparedStatement.setString(6, obj.getHeight());
            preparedStatement.setString(7,obj.getEngine());
            preparedStatement.setString(8,obj.getPermissibleWeight());
            preparedStatement.setInt(9, obj.getMotorhomeId());
            preparedStatement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }


    }

    @Override
    public void delete(Motorhome obj) {
        try {
            preparedStatement = conn.prepareStatement("DELETE FROM motorhomes WHERE MotorhomesID = ? ");
            preparedStatement.setInt(1, obj.getMotorhomeId());
            preparedStatement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
