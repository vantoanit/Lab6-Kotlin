package com.example.lab6_kotlin.Bai1

data class Movie (
    val title: String,
    val year: String,
    val duration: String,
    val releaseDate: String,
    val genre: String,
    val shortDescription: String,
    val posterUrl: String
){
    companion object {
        fun getSampleMovies() = listOf(
            Movie("Inception", "2010", "148 min", "2010-07-16", "Sci-Fi",
                "A thief who steals corporate secrets through the use of dream-sharing technology...",
                "https://images2.thanhnien.vn/528068263637045248/2024/1/25/428059e47aeafb68640f168d615371dc-65a11b038315c880-1706156293087602824781.jpg"),
            Movie("Interstellar", "2014", "169 min", "2014-11-07", "Sci-Fi",
                "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival...",
                "https://i.pinimg.com/736x/91/36/9d/91369d9fbf87b5b8f3e495959ccc11e8.jpg"),
            Movie("The Dark Knight", "2008", "152 min", "2008-07-18", "Action",
                "When the menace known as the Joker emerges from his mysterious past...",
                "https://gcs.tripi.vn/public-tripi/tripi-feed/img/474115ccF/anh-nen-cay-xanh-cho-dien-thoai_103834301.jpg"),
        )
    }
}
