package com.example.uas.app;

public class Server {
    public static final String URL = "http://192.168.1.104/php/";
    public static final String URL_GET_PELANGGAN = "http://172.20.10.2/bookfut/register.php?nohp=";
    public static final String URL_GET_ALL = "http://172.20.10.2/bookfut/tampilSemuaPsn.php";
    public static final String URL_GET_PSN = "http://172.20.10.2/bookfut/tampilPsn.php?kdbook=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_PSN_KDBOOK = "kd";
    public static final String KEY_PSN_BOOKTGL = "tgl";
    public static final String KEY_PSN_BOOKJAM = "jam";
    public static final String KEY_PSN_TOTALHRG = "hrg";
    public static final String KEY_PSN_NOHP = "no";
    public static final String KEY_PSN_KDLAP = "lap";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_KDBOOK = "kd";
    public static final String TAG_BOOKTGL = "tgl";
    public static final String TAG_BOOKJAM = "jam";
    public static final String TAG_TOTALHRG = "hrg";
    public static final String TAG_NOHP = "no";
    public static final String TAG_KDLAP = "lap";

    //KD booking
    //psn itu singkatan dari pemesanan
    public static final String PSN_KD = "psn_kd";

}
