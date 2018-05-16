package nordicmotorhomes.project.Repositories;

import nordicmotorhomes.project.Model.Price;
import nordicmotorhomes.project.Repositories.Util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PriceRepository implements ICrudRepository<Price> {
    private Connection conn;
    private PreparedStatement preparedStatement;
    private ResultSet result;

    public PriceRepository() {
        this.conn = DbConnection.getConnection();
    }

    @Override
    public ArrayList<Price> readAll() {
        ArrayList<Price> price = new ArrayList<>();
        try {
            preparedStatement = conn.prepareStatement("SELECT * FROM prices");
            result = preparedStatement.executeQuery();

            while (result.next()) {
                price.add(new Price(result.getInt("PeakSeasonPrice"), result.getInt("MiddleSeasonPrice"), result.getInt("LowSeasonPrice"),result.getByte("PeakSelected"), result.getByte("MiddleSelected"),result.getByte("LowSelected"), result.getInt("MotorhomesID")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return price;
    }

    @Override
    public Price read(int id) {
        return null;
    }

    @Override
    public void create(Price obj) {

    }

    @Override
    public void update(Price obj) {

    }

    @Override
    public void delete(Price obj) {

    }
}
