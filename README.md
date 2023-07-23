# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan pesanana mie gacoan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa menu, costumer dan kode, dan memberikan output berupa informasi pesanan dari kode tersebut seperti no pesanan dan level.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `MieGacoan`, `PesananMieGacoan`, dan `MieGacoanBeraksi` adalah contoh dari class.

```bash
public class MieGacoan {
    ...
}

public class PesananMieGacoan extends MieGacoan {
    ...
}

public class  MieGacoanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `MieGacoan[i] = new PesananMieGacoan(menu, costumer, kode);` adalah contoh pembuatan object.

```bash
MieGacoan[i] = new PesananMieGacoan(menu, costumer, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `menu`,`costumer` dan `kode` adalah contoh atribut.

```bash
String menu;
String costumer;
String kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `MieGacoan` dan `PesananMieGacoan`.

```bash
public MieGacoan(String menu, String costumer, String kode) {
        this.menu = menu;
        this.costumer = costumer;
        this.kode = kode;
}

public PesananMieGacoan(String menu, String costumer, String kode) {
        super(menu, costumer, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMenu`,`setCostumer` dan `setKode` adalah contoh method mutator.

```bash
public void setMenu(String menu) {
        this.menu = menu;
    }
    
    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public void setKode(String kode) {
        this.kode = kode;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMenu`, `getCostumer`, `getKode`, `getNoPesanan`,  dan `getLevel` adalah contoh method accessor.

```bash
public String getMenu() {
        return menu;
    }

    public String getCostumer() {
        return costumer;
    }

    public String getKode() {
        return kode;
    }
    
    public String displayInfo() {
        return "Menu: "+getMenu()+"\nCostumer: "+getCostumer()+"\nKode: "+getKode();
    }
    
    //Polymophism (Overloading)
    public String displayInfo(String NoPesanan) {
        return displayInfo() + "\nNoPesanan: " + NoPesanan;
    }
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `menu`,`costumer` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String menu;
private String costumer;
private String kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PesananMieGacoan` mewarisi `MieGacoan` dengan sintaks `extends`.

```bash
public class PesananMieGacoan extends MieGacoan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `PesananMieGacoan` merupakan override dari method `displayInfo` di `MieGacoan`.

```bash
public String displayInfo(String NoPesanan) {
return displayInfo() + "\nNoPesanan: " + NoPesanan;
}

 @Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getlevel` .

```bash
public String getLevel() {
        if (getKode().substring(2, 3).equals("A")) {
            return "Mie Angel";
        } else if (getKode().substring(2, 3).equals("B")) {
            return "Mie Setan";
        } else if (getKode().substring(2, 3).equals("C")) {
            return "Mie Iblis";
        } else {
            return "costum";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan pesanan.

```bash
ffor(int i=0; i<MieGacoan.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PesananMieGacoan[] MieGacoan = new PesananMieGacoan[2];` adalah contoh penggunaan array.

```bash
PesananMieGacoan[] MieGacoan = new PesananMieGacoan[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format kode: "+e.getMessage())
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Akhmad Nizar
NPM: 2110010124
