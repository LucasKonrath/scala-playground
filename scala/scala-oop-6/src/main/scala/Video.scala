class Video(title: String,
            author: String,
            val duration: Int) extends Media(title, author) with Downloadable
