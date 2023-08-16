package org.d3if2029.homeworkout.db

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.Exercise2Model


class Exercises2 {

    companion object{
        fun defaultExerciseList():ArrayList<Exercise2Model>{
            var exercisesList = ArrayList<Exercise2Model>()

            val jumpingJacks = Exercise2Model(1,
                "Jumping Jacks",
                R.drawable.jumping_jacks,
                "Jumping jack adalah gerakan aerobik dengan melompat sambil membuka dan menutup kaki serta angkat lengan di atas kepala. Berdiri tegak, buka kaki dan angkat lengan pada hitungan satu, lalu kembali ke posisi awal pada hitungan dua. Lakukan gerakan ini secara berulang dengan ritme cepat untuk melatih kardiovaskular dan meningkatkan stamina.",
                false,
                false)
            exercisesList.add(jumpingJacks)

            val wallSit = Exercise2Model(2,
                "Wall Sit",
                R.drawable.wall_sit,
                "Caranya, berdiri di depan dinding, berjalan kaki beberapa langkah menjauhi dinding, lalu bersandar pada dinding dengan punggung. Selanjutnya, langkahkan kaki ke depan dan berjongkok seperti posisi duduk di kursi, pastikan lutut membentuk sudut 90 derajat dan punggung menempel pada dinding. ",
                false,
                false)
            exercisesList.add(wallSit)

            val pushUp = Exercise2Model(3,
                "Push Ups",
                R.drawable.pushups,
                "Push-up dilakukan dengan posisi tubuh telentang di lantai dan tangan diletakkan sedikit lebih lebar dari bahu. Tekuk siku untuk menurunkan tubuh ke dekat lantai, lalu dorong tubuh kembali ke atas menggunakan lengan. Latihan ini kuat untuk menguatkan otot dada, lengan, dan inti tubuh.",
                false,
                false)
            exercisesList.add(pushUp)

            val abCrunch = Exercise2Model(4,
                "Abdominal crunch",
                R.drawable.ab_crunch,
                "Abdominal Crunch adalah latihan yang melibatkan berbaring telentang dengan lutut ditekuk dan telapak kaki rata di lantai. Letakkan tangan di belakang kepala dengan jari-jari terentang. Kemudian, angkat bahu Anda dari lantai dengan menggunakan otot perut, tanpa mengangkat seluruh punggung. Turunkan kembali dengan kendali untuk satu repetisi. Latihan ini bertujuan mengencangkan otot perut bagian atas.",
                false,
                false)
            exercisesList.add(abCrunch)

            val stepUp = Exercise2Model(5,
                "Step-Up Onto Chair",
                R.drawable.stepup,
                "Step-up onto a chair adalah latihan yang melibatkan langkah naik ke atas kursi. Mulailah dengan berdiri di depan kursi. Angkat kaki kanan dan letakkan telapak kaki di atas kursi, kemudian dorong tubuh dengan kaki kanan hingga berdiri penuh di atas kursi. Turunkan tubuh kembali dengan kaki kanan, diikuti kaki kiri. Latihan ini dapat membantu memperkuat otot kaki dan meningkatkan keseimbangan. Pastikan menggunakan kursi yang stabil dan sesuaikan intensitas sesuai tingkat Anda.",
                false,
                false)
            exercisesList.add(stepUp)

            val squat = Exercise2Model(6,
                "Squat",
                R.drawable.squat,
                "Squat adalah latihan yang melibatkan posisi berdiri dengan kaki selebar bahu, kemudian menekuk lutut dan pinggul seperti duduk, lalu kembali ke posisi berdiri. Pastikan menjaga punggung lurus dan kaki tetap sejajar saat menurunkan tubuh. Latihan ini efektif untuk menguatkan otot paha, panggul, dan inti tubuh.",
                false,
                false)
            exercisesList.add(squat)

            val tricepsDip = Exercise2Model(7,
                "Triceps Dip On Chair",
                R.drawable.triceps_dip,
                "Triceps dip on chair adalah latihan yang dilakukan dengan duduk di kursi, tangan memegang pinggiran kursi di samping pinggul, kaki ditekuk dengan telapak kaki rata di lantai. Geser pinggul keluar dari kursi, lalu tekuk siku hingga tubuh turun ke bawah, dan dorong kembali tubuh ke atas hingga siku lurus. Latihan ini melibatkan otot trisep dan bisa membantu menguatkan lengan bagian belakang.",
                false,
                false)
            exercisesList.add(tricepsDip)

            val plank = Exercise2Model(8,
                "Plank",
                R.drawable.plank,
                "Plank adalah latihan di mana Anda berbaring telentang dengan berat tubuh ditopang oleh lengan yang ditekuk, dengan siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dan Anda harus menjaga inti tubuh terasa tegang. ",
                false,
                false)
            exercisesList.add(plank)

            val highKnees = Exercise2Model(9,
                "High Knees Running In Place",
                R.drawable.high_knees,
                "High knees running in place adalah latihan yang melibatkan berlari diam di tempat sambil mengangkat lutut setinggi mungkin secara bergantian. Berdiri tegak, mulailah mengangkat lutut kanan setinggi pinggang sambil berlari di tempat, lalu ganti dengan lutut kiri.",
                false,
                false)
            exercisesList.add(highKnees)

            return exercisesList
        }
    }
}