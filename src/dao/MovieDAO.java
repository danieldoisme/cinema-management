package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Movie;

public class MovieDAO extends DAO {

    public MovieDAO() {
        super();
    }

    public ArrayList<Movie> listMovies() {
        ArrayList<Movie> result = new ArrayList<>();
        String sql = "SELECT * FROM tblMovie";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getInt("ID"));
                movie.setTitle(rs.getString("title"));
                movie.setGenre(rs.getString("genre"));
                movie.setType(rs.getString("type"));
                movie.setReleaseYear(rs.getInt("releaseYear"));
                movie.setDescription(rs.getString("description"));

                result.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
