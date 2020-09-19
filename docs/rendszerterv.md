## 5. Üzleti szereplők  

Az elkészült programot az éppen munkaidejét töltő recepciós fogja használni.  
A panzió összes alkalmazottjának, akik ebben a munkakörben dolgoznak  
megvan a végzettsége és a tudása ahoz, hogy SZFM_2020_14_RLK-Development
 csapat által készített  
programot magabiztosan képes legyen használni.  

### 5.1. Üzleti entitások  

Az üzletben résztvevő entitások:  
- A programot használó személyzet 
- A panzió szolgáltatásait igénybe vett regisztrált vendégek  
- A panzióba még nem regisztrált, de majd regisztráló vendégek

## 6. Követelmények

### 6.1.Funkcionális követelmények 

- Könnyen és egyszerűen kezelhető rendszer.
- Letisztult átlátható adatbázis kezelés.
- Egyszerű adatbázis lekérdezések megvalósítása.
- Könnyű egyszerű adatfelvétel és módosítás.

### 6.2. Nem funkcionális követelmények

- Letisztult esztétikus felhasználói felület.
- Látás károsultak számára is megfelelő színvilág és betűméretek használata.
- Clean code-nak való megfelelés.

## 7. Funkcionális terv   

A program célja a vendégek regisztrációjának a felgyorsítása valamint a panzióban dolgozó személyzet
munkájának megkönnyebbítése. Valamint a jelenlegi analóg adminisztrációs módszer teljes lecserélése
digitális formára. A korábbi módszer minden 'funkciójának' átültetése számítógépes környezetbe.

Ezek a 'funkciók' nem mások, mint:

 - A panzió vendégeinek nyílvántartása.
 - A kiadott szobák feljegyzése.
 - A vendégek kijelentkezésének időpontja.
 - Az igényelt szoba típusa.

 ## 8. Rendszerszereplők  

A rendszerben két féle entitás csoportot különböztetünk meg.


A két csoport:
- Személyzet csoportja
- Vendégek csoportja

A programot a személyzet csoportja fogja használni és egyfajta szolgáltatást
nyújt ezzel a vendégek csoportjának.

A személyzet csoportjának sokkal több joga lesz, sőt a tagok nem is használhatják
a programot. Nekik kell lebonyolítani a kapcsolattartást is a tagokkal.
Feladatuk kiterjed a régi vendégek értesítésére szezonális kedvezmények esetén.

## 12. Implementációs terv

A tervezési folyamat során célszerű vagy mondhatjuk úgy, hogy ajánlott az általános logikai felépítést mindig valamilyen 
grafikus reprezentációval
modellezni, mert az emberi agy vizualizált objektumokkal könnyebben dolgozik.
Az UML (=Unified Modeling Language), modellező nyelv segítségével a specifikációt és 
a tervezést is grafikus
formában, diagramok segítségével tudjuk dokumentálni. A követelményspecifikációban a használati
esetdiagramokat (use case), az adatbázis tervezésnél az adatbázis diagramot, az OOP 
tervezésnél az
osztálydiagramot és objektumdiagramot valamint a szekvenciadiagramot, aktivitásdiagramot
használhatjuk.

### 12.1. Perzisztencia-osztályok 

A perzisztencia megvalósításáért a Hibernate objektum-relációs leképezést
megvalósító programkönyvtár felel.


Perzisztencia osztályok:
- DBUtils
- HibernateUtils
   
### 12.2. Üzleti logika osztályai  

Az üzleti logika a háromrétegű adatkezelő alkalmazások középső rétege, amely meghatározza 
az alkalmazás működésének logikáját.
A háromrétegű architektúra az alkalmazást három különálló rétegre osztja fel. E rétegek 
komponensei önállóan léteznek, és együttműködésük során egyidejűleg több különböző 
alkalmazásnak is a részei lehetnek.
Az adatbázislogika az adatok nyers tárolását végzi. Semmilyen információval nem rendelkezik 
az adatok feldolgozásával vagy megjelenítésével kapcsolatban.
Az ügyviteli (üzleti) logika az alkalmazás logikáját, működési szabályait határozza meg. 
Semmilyen információval nem rendelkezik az adatok tárolásával vagy megjelenítésével kapcsolatban.
A felhasználói interfész feladata az ügyviteli logika által küldött adatok formázása és
megjelenítése. Biztosítja a felhasználó hozzáférését az ügyviteli logika szolgáltatásaihoz. 
Sohasem kerül közvetlen kapcsolatba az adatbázissal, és nem végez semmilyen műveletet az 
adatokon.