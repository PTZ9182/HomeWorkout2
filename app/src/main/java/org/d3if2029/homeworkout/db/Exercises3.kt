package org.d3if2029.homeworkout.db

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.Exercise3Model


class Exercises3 {

    companion object{
        fun defaultExerciseList():ArrayList<Exercise3Model>{
            var exercisesList = ArrayList<Exercise3Model>()

            val jumpingJacks = Exercise3Model(1,
                "Jumping Jacks",
                R.drawable.jumping_jacks,
                "Jumping jack adalah gerakan aerobik dengan melompat sambil membuka dan menutup kaki serta angkat lengan di atas kepala. Berdiri tegak, buka kaki dan angkat lengan pada hitungan satu, lalu kembali ke posisi awal pada hitungan dua. Lakukan gerakan ini secara berulang dengan ritme cepat untuk melatih kardiovaskular dan meningkatkan stamina.",
                false,
                false)
            exercisesList.add(jumpingJacks)

            val wallSit = Exercise3Model(2,
                "Wall Sit",
                R.drawable.wall_sit,
                "Caranya, berdiri di depan dinding, berjalan kaki beberapa langkah menjauhi dinding, lalu bersandar pada dinding dengan punggung. Selanjutnya, langkahkan kaki ke depan dan berjongkok seperti posisi duduk di kursi, pastikan lutut membentuk sudut 90 derajat dan punggung menempel pada dinding. ",
                false,
                false)
            exercisesList.add(wallSit)

            val pushUp = Exercise3Model(3,
                "Push Ups",
                R.drawable.pushups,
                "Push-up dilakukan dengan posisi tubuh telentang di lantai dan tangan diletakkan sedikit lebih lebar dari bahu. Tekuk siku untuk menurunkan tubuh ke dekat lantai, lalu dorong tubuh kembali ke atas menggunakan lengan. Latihan ini kuat untuk menguatkan otot dada, lengan, dan inti tubuh.",
                false,
                false)
            exercisesList.add(pushUp)

            val abCrunch = Exercise3Model(4,
                "Abdominal crunch",
                R.drawable.ab_crunch,
                "Abdominal Crunch adalah latihan yang melibatkan berbaring telentang dengan lutut ditekuk dan telapak kaki rata di lantai. Letakkan tangan di belakang kepala dengan jari-jari terentang. Kemudian, angkat bahu Anda dari lantai dengan menggunakan otot perut, tanpa mengangkat seluruh punggung. Turunkan kembali dengan kendali untuk satu repetisi. Latihan ini bertujuan mengencangkan otot perut bagian atas.",
                false,
                false)
            exercisesList.add(abCrunch)

            val stepUp = Exercise3Model(5,
                "Step-Up Onto Chair",
                R.drawable.stepup,
                "Step-up onto a chair adalah latihan yang melibatkan langkah naik ke atas kursi. Mulailah dengan berdiri di depan kursi. Angkat kaki kanan dan letakkan telapak kaki di atas kursi, kemudian dorong tubuh dengan kaki kanan hingga berdiri penuh di atas kursi. Turunkan tubuh kembali dengan kaki kanan, diikuti kaki kiri. Latihan ini dapat membantu memperkuat otot kaki dan meningkatkan keseimbangan. Pastikan menggunakan kursi yang stabil dan sesuaikan intensitas sesuai tingkat Anda.",
                false,
                false)
            exercisesList.add(stepUp)

            val squat = Exercise3Model(6,
                "Squat",
                R.drawable.squat,
                "Squat adalah latihan yang melibatkan posisi berdiri dengan kaki selebar bahu, kemudian menekuk lutut dan pinggul seperti duduk, lalu kembali ke posisi berdiri. Pastikan menjaga punggung lurus dan kaki tetap sejajar saat menurunkan tubuh. Latihan ini efektif untuk menguatkan otot paha, panggul, dan inti tubuh.",
                false,
                false)
            exercisesList.add(squat)
            return exercisesList
        }
    }
}