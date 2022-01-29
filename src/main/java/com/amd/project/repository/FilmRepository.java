package com.amd.project.repository;

import com.amd.project.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query(value = "select insert_film(:_filmTitle, :_filmDesc, :_filmRelDate, :_parentFilmId, :_isSubFilm,  :_personIdList, :_genreIdList, :_personIdLength, :_genreIdLength, :_rating)", nativeQuery = true)
    int create(@Param("_filmTitle") String _filmTitle,
               @Param("_filmDesc") String _filmDesc,
               @Param("_filmRelDate") String _filmRelDate,
               @Param("_parentFilmId") int _parentFilmId,
               @Param("_isSubFilm") boolean _isSubFilm,
               @Param("_personIdList") String _personIdList,
               @Param("_genreIdList") String _genreIdList,
               @Param("_personIdLength") int _personIdLength,
               @Param("_genreIdLength") int _genreIdLength,
               @Param("_rating") int _rating
    );

    @Query(value = "select update_film(:_parentid, :_desc, :_relDate, :_subFilmId, :_filmGenreId,  :_filmPersonId, :_subFilmLength, :_filmGenreLength, :_filmPersonLength, :_isSubFilm, :_rating)", nativeQuery = true)
    int update(@Param("_parentid") int _parentid,
               @Param("_desc") String _desc,
               @Param("_relDate") String _relDate,
               @Param("_subFilmId") String _subFilmId,
               @Param("_filmGenreId") String _filmGenreId,
               @Param("_filmPersonId") String _filmPersonId,
               @Param("_subFilmLength") int _subFilmLength,
               @Param("_filmGenreLength") int _filmGenreLength,
               @Param("_filmPersonLength") int _filmPersonLength,
               @Param("_isSubFilm") boolean _isSubFilm,
               @Param("_rating") int _rating
    );

    @Query(value = "select * from get_film_list()", nativeQuery = true)
    List<Film> findAllFilm();

    @Query(value = "select * from search_film(:_title)", nativeQuery = true)
    List<Film> searchFilms(@Param("_title") String _title);

    @Query(value = "select * from get_film_info(:_searchId)", nativeQuery = true)
    Film findById(@Param("_searchId") int _searchId);

    @Query(value = "select * from get_films_by_person(:_searchId)", nativeQuery = true)
    List<Film> findAllByPersonId(@Param("_searchId") int _searchId);

    /*@Query(value = "select * from get_film_rating(:_searchId, :_isSubFilm)", nativeQuery = true)
    double getFilmRating(@Param("_searchId") int _searchId, @Param("_isSubFilm") boolean _isSubFilm);*/

    @Query(value = "select delete_film(:_id)", nativeQuery = true)
    boolean delete(@Param("_id") int _id);

}
