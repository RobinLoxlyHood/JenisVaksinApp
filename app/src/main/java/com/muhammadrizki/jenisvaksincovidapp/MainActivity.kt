package com.muhammadrizki.jenisvaksincovidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Jenis-Jenis Vaksin di Indonesia"
        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.sinovac," Vaksin SinoVac","Sinovac Biotech",
            "Vaksin Sinovac diproduksi oleh perusahaan biofarmasi China, Sinovac BioTech " +
                "dengan nama merek CoronaVac. Vaksin ini bertipe whole virus, yang memanfaatkan virus" +
                "SARS-CoV-2 non aktif, sehingga sudah tidak bisa menginfeksi tubuh, tapi dapat memicu " +
                "pembentukan imun. Dari hasil uji coba, vaksin Sinovac mempunyai berbagai angka efikasi " +
                "atau kemanjuran melawan virus yang berbeda-beda. Dari uji coba di Brasil efikasinya "+
                "sekitar 50,65 persen, di Turki mencapai 91,25 persen, dan di Indonesia sebesar 65,3 "+
                "persen. Setelah mendapatkan izin penggunaan darurat dari Badan Pengawas Obat dan "+
                "Makanan (BPOM), vaksin Sinovac mulai digunakan untuk program vaksinasi di Indonesia. " +
                "Selain Indonesia, negara-negara lain yang sudah memesan vaksin Sinovac di antaranya "+
                "Brasil, Chili, Turki, Singapura, Filipina, dan Malaysia."))

        data?.add(DataModel(R.drawable.astrazeneca,"Vaksin AstraZeneca","Universitas Oxford",
            "Vaksin AstraZeneca atau Oxford-AstraZeneca merupakan vaksin yang diproduksi " +
                "biofarmasi asal Inggris bekerja sama dengan Universitas Oxford. Vaksin ini bertipe viral " +
                "vector, memanfaatkan adenovirus simpanse yang sudah dilemahkan, untuk "+
                "mengantarkan protein spike dari Covid-19 ke dalam sel tubuh sehingga memicu"+
                "pembentukan antibodi. Vaksin diberikan dalam dua kali suntikan, dengan efikasi berada di "+
                "angka 70 persen secara keseluruhan. Adapun negara-negara yang telah menggunakan "+
                "vaksin ini antara lain Vietnam, India, Malaysia, Filipina, Taiwan, dan Korea."))

        data?.add(DataModel(R.drawable.biontech,"Vaksin Pfizer-BioNTech","BioNtech",
            "Vaksin Pfizer-BioNTech merupakan kolaborasi antara perusahaan bioteknologi " +
                "Jerman, BioNTech, dengan perusahaan farmasi asal Amerika, Pfizer. Terkait " +
                "pembuatannya, vaksin ini berbasis messenger RNA (mRNA) atau vaksin asam nuklea. "+
                "Vaksin ini menggunakan materi genetik, yaitu protein spike dari Covid-19, yang "+
                "dimanfaatkan untuk memberikan instruksi kepada sel tubuh agar membentuk antibodi."+
                "Efikasi atau kemanjuran dalam melawan Covid-19 sekitar 95 persen dan telah digunakan "+
                "di berbagai negara seperti Inggris, Australia, Amerika Serikat, Israel, Arab Saudi, Korea "+
                "Selatan, Filipina, Singapura, dan Malaysia."))

        data?.add(DataModel(R.drawable.moderna,"Vaksin Moderna","mRNA",
            "Vaksin Moderna diproduksi oleh perusahaan bioteknologi asal Amerika Serikat." +
                "Vaksin ini dibuat berbasis mRNA, dengan menggunakan materi genetik untuk memberikan " +
                "stimulus kepada sel tubuh agar membentuk antibodi. Vaksin Moderna diberikan dalam "+
                "dua kali suntikan dan menurut penelitian mempunyai efikasi atau kemanjuran sekitar 95 "+
                "persen. Vaksin Moderna telah digunakan di Amerika Serikat, Singapura, Inggris, dan Israel."))

        data?.add(DataModel(R.drawable.sinopharm,"Vaksin Sinopharm","Sinopharm China Nationel Pharmaceutical",
            "Vaksin Covid-19 Sinopharm dikembangkan oleh perusahaan farmasi China, " +
                "Sinopharm China Nationel Pharmaceutical. Dapatkan informasi, inspirasi dan insight di " +
                "email kamu. Daftarkan email Vaksin ini dapat diberikan untuk kelompok usia 18 tahun "+
                "hingga lanjut usia, dengan efikasi sebesar 78 persen. Vaksin Sinopharm diberikan dalam "+
                "dua dosis, dengan selang waktu 21-28 hari."))

        data?.add(DataModel(R.drawable.jansen,"Vaksin Johnson & Johnson","Grand River USA, Aspen South Africa, dan Catalent Indiana, USA",
            "Vaksin Johson & Johson disetujui digunakan di Indonesia yang ditujukan untuk " +
                "kelompok usia 18 tahun ke atas. Vaksin ini diberikan dalam sekali suntikan atau dosis " +
                "tunggal sebanyak 0,5 ml secara intramascular. Melansir situs resmi, efikasi vaksin  "+
                "Janssen sebesar 67,2 persen untuk mencegah semua gejala dan 66,1 persen untuk "+
                "mencegah gejala Covid-19 sedang hingga berat. Janssen merupakan vaksin yang "+
                "dikembangkan Janssen Pharmaceutical Companies dengan platform Non-Replicating "+
                "Viral Vector menggunakan vektor adenovirus (Ad26). Vaksin diproduksi di beberapa"+
                "fasilitas produksi, seperti Grand River USA, Aspen South Africa, dan Catalent Indiana, USA."))

        data?.add(DataModel(R.drawable.cansino,"Vaksin CanSino","CanSino Biological Inc. dan Beijing Institute of Biotechnology",
            "Vaksin yang dikembangkan oleh CanSino Biological Inc. dan Beijing Institute of " +
                "Biotechnology mempunyai merek dagang Convidecia. Vaksin ini menggunakan platform " +
                "adenovirus (Ad5), yang disimpan dalam suhu 2-8 derajat celcius. Untuk efikasinya, vaksin "+
                "Convidecia memberikan perlindungan pada semua gejala sebesar 65,3 persen dan 90,1 "+
                "persen terhadap kasus berat."))


        data?.add(DataModel(R.drawable.sputnikv,"Vaksin Sputnik-V","Gamaleya Research Institute of Epidemiology and Microbiology",
            "Vaksin asal Rusia yang dikembangkan oleh Gamaleya Research Institute of " +
                "Epidemiology and Microbiology ini mempunyai nama lain Gam-COVID-Vac. Vaksin ini " +
                "bertipe vaksin viral vector, yang memanfaatkan adenovirus non-aktif untuk mengantarkan "+
                "protein spike dari Covid-19 ke dalam sel tubuh, sehingga memicu pembentukan antibodi."+
                "Efikasi dari vaksin dilaporkan mencapai sekitar 96,1 persen. Beberapa negara lain yang "+
                "telah menggunakan vaksin ini seperti Rusia, Iran, Arab Saudi, Palestina, Serbia, Belarusia, "+
                "Armenia, dan Tunisia."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("produksi", item?.produksi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}