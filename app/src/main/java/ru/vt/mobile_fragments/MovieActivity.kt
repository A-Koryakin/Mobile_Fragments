package ru.vt.mobile_fragments

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate

class MovieActivity : AppCompatActivity(), MovieListEventListener{

    lateinit var movieListFragment : MovieListFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val fragmentManager = supportFragmentManager
        movieListFragment = MovieListFragment(createHelper(), this)
        fragmentManager.beginTransaction().add(R.id.constraint_layout, movieListFragment).commit()
    }

    private fun createHelper(): List<Movie>{
        val films = mutableListOf<Movie>()

        val labyrinthOfFaun = Movie("Лабиринт Фавна",
            LocalDate.of(2006, 11, 7),
            arrayOf("драма", "ужасы", "фэнтези", "приключения", "исторический"),
            R.drawable.favn_lab,
            "Испания, 1944 год. Группа повстанцев сражается с фашистами в горных лесах северной Наварры. Офелия — 10-летняя одинокая и мечтательная девочка — переезжает со своей беременной матерью Кармен в военный лагерь отчима, капитана Видаля. Видаль — высокомерный и жестокий офицер армии Франко, который должен очистить район от повстанцев любой ценой. Офелия, увлеченная волшебными сказками, обнаруживает старинный заброшенный лабиринт неподалеку от дома."
        )

        val hatiko = Movie("Хатико",
            LocalDate.of(2008, 8, 8),
            arrayOf("драма"),
            R.drawable.hatiko,
            "В основе сюжета — реальная история, случившаяся в Японии и потрясшая весь мир. Однажды, возвращаясь с работы, профессор колледжа нашел на вокзале симпатичного щенка породы акита-ину. Профессор и Хатико стали верными друзьями. Каждый день пес провожал и встречал Профессора на вокзале. И даже потеря хозяина не остановила пса в его надежде, что друг вернется."
        )

        val backToTheFuture = Movie("Назад в будущее",
            LocalDate.of(1985, 7, 3),
            arrayOf("приключенческий фильм, комедия, фантастика"),
            R.drawable.back_to_the_future,
            "Подросток Марти с помощью машины времени, сооружённой его другом-профессором доком Брауном, попадает из 80-х в далекие 50-е. Там он встречается со своими будущими родителями, ещё подростками, и другом-профессором, совсем молодым."
        )

        val parasitians = Movie("Паразиты",
            LocalDate.of(2019, 7, 4),
            arrayOf("комедийная драма, триллер"),
            R.drawable.parasitians,
            "Обычное корейское семейство Кимов жизнь не балует. Приходится жить в сыром грязном полуподвале, воровать интернет у соседей и перебиваться случайными подработками. Однажды друг сына семейства, уезжая на стажировку за границу, предлагает тому заменить его и поработать репетитором у старшеклассницы в богатой семье Пак. Подделав диплом о высшем образовании, парень отправляется в шикарный дизайнерский особняк и производит на хозяйку дома хорошее впечатление. Тут же ему в голову приходит необычный план по трудоустройству сестры."
        )

        val leon = Movie("Леон",
            LocalDate.of(1994, 9, 14),
            arrayOf("драма, криминальный боевик"),
            R.drawable.leon,
            "Профессиональный убийца Леон, не знающий пощады и жалости, знакомится со своей очаровательной соседкой Матильдой, семью которой расстреливают полицейские, замешанные в торговле наркотиками. Благодаря этому знакомству он впервые испытывает чувство любви, но…"
        )

        val nonLove = Movie("Нелюбовь",
            LocalDate.of(2017, 6, 1),
            arrayOf("драма"),
            R.drawable.non_love,
            "Московская семья переживает мучительный развод. Женя и Борис — ещё супруги, но каждый из них уже фактически начал новую главу жизни, и потому им не терпится покончить с формальностями и развестись. В череде конфликтов и бесконечных взаимных претензий Женя и Борис пренебрегают своим единственным ребенком, 12-летним Алёшей, который чувствует абсолютную ненужность обоим родителям. После очередной ссоры Алёша исчезает."
        )

        val taxiDriver = Movie("Таксист",
            LocalDate.of(2017, 7, 4),
            arrayOf("драма, триллер, неонуар"),
            R.drawable.taxi_driver,
            "Ветеран вьетнамской войны Трэйвис Бикл ведет свое одинокое такси по ночным улицам бесконечного города, и перед ним разворачивается мрачная панорама человеческих грехов. Как ветхозаветный пророк, он надеется, что однажды небеса пошлют на землю спасительный дождь, который очистит Нью-Йорк от вековой грязи."
        )

        val holyDeerKilling = Movie("Убийство священного оленя",
            LocalDate.of(2017, 11, 16),
            arrayOf("драма, психологический триллер"),
            R.drawable.holy_deer_killing,
            "Успешный кардиохирург Стивен живёт обычной размеренной семейной жизнью с женой Анной и двумя прелестными детьми. Но вскоре спокойствие нарушается призраком из прошлого Стивена, и у одного из его детей без видимой причины отказывают ноги."
        )

        val godfather = Movie("Крёстный отец",
            LocalDate.of(1972, 3, 14),
            arrayOf("эпическая гангстерская драма"),
            R.drawable.godfather,
            "Глава семьи, Дон Вито Корлеоне, выдаёт замуж свою дочь. В это время со Второй мировой войны возвращается его любимый сын Майкл. Майкл, герой войны, гордость семьи, не выражает желания заняться жестоким семейным бизнесом. Дон Корлеоне ведёт дела по старым правилам, но наступают иные времена, и появляются люди, желающие изменить сложившиеся порядки. На Дона Корлеоне совершается покушение."
        )

        val kingsSpeech = Movie("Король говорит!",
            LocalDate.of(2010, 9, 6),
            arrayOf("исторический фильм"),
            R.drawable.kings_speech,
            "Сюжет ленты расскажет о герцоге, который готовится вступить в должность британского короля Георга VI, отца нынешней королевы Елизаветы II. После того, как его брат отрекается от престола, герой неохотно соглашается на трон. Измученный страшным нервным заиканием и сомнениями в своих способностях руководить страной, Георг обращается за помощью к неортодоксальному логопеду по имени Лайонел Лог."
        )

        films.add(labyrinthOfFaun)
        films.add(hatiko)
        films.add(backToTheFuture)
        films.add(parasitians)
        films.add(leon)
        films.add(nonLove)
        films.add(taxiDriver)
        films.add(holyDeerKilling)
        films.add(godfather)
        films.add(kingsSpeech)

        return films
    }

    override fun onClick(movie: Movie) {
        intent = Intent(this, MovieDetailActivity::class.java)
        intent.putExtra("movie", movie)
        startActivity(intent)
    }
}
