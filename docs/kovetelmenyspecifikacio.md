# Követelményspecifikáció

## 1.Bevezetés
A koronavírus épp olyan negatív hatással volt Magyarország turizmusára mint a többi Európai országra egyaránt. A tavasszal országosan elrendelt karantént a Balaton környéki panziók is megérezték, mivel a tavalyi évhez képest sokkal kevesebb volt az idelátogató vendégek száma. Általában tavasszal valamint nyáron egy Balaton parti panzió nagy forgalommal jár, az emberek szivesebben jönnek egy meghitt, családias hangulatú helyre nyaralni. Viszont idén a karantén bevezetése után sajnos a tavaszi hónapokban elég kevés vendég vette igénybe szolgáltatásunkat. Viszont szerencsére mihelyt beköszöntött a nyár egyre több vendég választotta kikapcsolódásként a Balatont. Ennek köszönhetően elgondolkodtunk azon, hogy valamilyen alternatív megoldást kéne kitalálni a vendégeink adatainak a tárolására, mivel eddig ez úgy valósult meg, hogy erre a célra alkalmas füzetekben tároltuk az adatokat. Napjainkban azonban, hogy versenyképesek tudjunk maradni nyitnunk kell a modern technologia felé. Éppen ezért a vezetés engyhangúan úgy döntött, hogy alkalmazkodik az új követelményekhez, és egy gyors és hatékony számítógépes rendszerre cseréli a hagyományos, papir alapu könyvelést. Ehhez szükség lenne egy alkalmazásra amely akár több munkaálomáson is futhat de mégis egy és ugyan azon adathalmazt éri el. Ehhez tudunk biztosítani egy központi gépet amelyhez a munkaálomásoknak hozzáférést biztosítunk. Ilyen módon növelhetjük a hatékonyságunk mivel egyszerre több vendéggel is foglalkozhatunk párhuzamosan. Mivel a döntés nem régen született meg ezért először a legfontosabb funkciók fejlesztése fog megtörténni, majd a visszajelzések alapján priorizáljuk a további fejlesztéseket a felhasználói igények alapján.

## 2. Jelenlegi helyzet

A Balaton egyre keresettebb nyaralási helyszín a belföldi valamint a külföldi turisták számára. Ez a növekedés azt eredményezi, hogy az utóbbi években a panziónkban is megugrott az ide látogató vendégek száma. A gyors növekedés viszont megnöveli az adminisztrációs munkát amit eddig papíron oldottunk meg. Dolgozóinknak egy vendégről több adatott is rögziteni kell például:

* Fel kell vennünk a vendég nevét
* Rögzitenünk kell a telefonszámát és email cimét
* Tárolnunk kell a szobával kapcsolatos adatokat(Szobaszámát, Szoba típusa(1,2 vagy 3 ágyas), Szoba kivételének és elhagyásának dátuma) illetve a fizetendő összeget.

Ezen adatok adminisztrálása kis vendégszám esetén kivitelezhető a hagyományos papír ceruza módszerrel de nagy létszámnál ez már lehetetlen.

## 3. Vágyálom rendszer

Amikor rájöttünk, hogy a klasszikus papír, ceruza alapú adminisztrációs rendszer nem a legkiválóbb megoldás a panziónk részére elkezdtünk gondolkodni, hogy mi lehetne a legmegfelelőbb alternetíva. Hosszas gondolkodás után úgy döntöttünk, hogy egy alkalmazásra lenne szükségünk. Az alkalmazással kapcsolatban a legfontosabb kritérium, hogy képes kell lenni tárolni a jelenlegi helyzet pontban emlitett adatokat. Az eltárolt adatokhoz elérést kell biztosítania a dolgozóink számára. Továbbá lehetőséget kell biztosítani az adatbáziban való keresés és módosításra.

## 4. Jelenlegi üzleti folyamatok

A panzióban jelenleg minden vendégünkkel kapcsolatos folyamatot papír segítségével adminisztráltunk. Ha egy új személy szeretné igénybe venni a panziónk szolgáltatásait akkor kézzel írott listánknak a végére vesszük fel az adatait, illetve ha később az adat felvételkor elkövetett hiba miatt egy vagy több adatot meg kell változtatni, akkor a módosítást szintén ebben a hosszú listában hajtjuk végre. Be kell látni, hogy ez a módszer a vendégek nagy létszáma mellett nem hatékony és egy esetleges hiba esetén pedig a módosítás sok keresésbe és időbe telik. Ha egy vendég azzal az igénnyel érkezik a panzióba, hogy szobát szeretne kivenni, akkor a folyamat azzal kezdődik, hogy a recepciós megnézi a füzet alapján melyik szoba üres és ha talál egy megfelő szobát, akkor feljegyzi a vendég adatait, hogy ki és milyen szobát kért, valamint mennyi időre vette ki. Amikor a vendég a szobát elhagyja, a recepciós feljegyzi, hogy a szoba mikor került elhagyásra. Természetesen ha a vendég adataiban valamilyen változás történik vagy vissza kell keresni, akkor a könyvben egyessével a többi vendég adatait is átnézve kell kikeresni az aktuális vendég adatait.

## 5. Igényelt üzleti folyamatok modellje

A panzió szeretné kiküszöbölni a jelenlegi analóg rendszer általi nehézségeket így, mint minden kisebb-nagyobb vendéglátó egység ők is követik a digitalizációt. A program funkciói között szerepel a legtöbb jelenlegi folyamat digitális változata. Nem ragaszkodnak az online adatbázishoz továbbá a lokális hálózaton való adat eléréshez. Megelégednek egy önálló gépen működő programmal. A rendszer képes kell, hogy legyen egy adott vendégről több adat tárolására is, hogy éppen ki melyik szobában tartózkodik. Emellett igen fontos lenne a könnyű kezelhetőség és egyben átláthatóság a felhasználók számára.

## 6. Követelménylista
* Egy rendszer ami nyilvántartja a panzióban megszállt vendégeket.
* A rendszer vendégenként legyen képes több adat tárolására.
* A nyilvántartásba lehetővé kell tenni a meglévő elemek módosítását, törlését és új elem létrehozását.
* A rendszer adjon lehetőséget az adathalmazban való keresésre.
* A rendszer tegye lehetővé, hogy adott idő intervallumban lekérdezük a vendégek számát és a bevételt.

