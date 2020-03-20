package ru.vt.mobile_fragments

import java.time.LocalDate

class Movie(_title : String, _date : LocalDate, _genres : Array<String>, _img_id : Int){
    var title : String
    var releaseDate : LocalDate
    var genres : Array<String>
    var poster : Int

    init {
        title = _title
        releaseDate = _date
        genres = _genres
        poster = _img_id
    }
}