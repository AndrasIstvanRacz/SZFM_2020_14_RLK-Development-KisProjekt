## 9. Rendszerhasználati esetek és lefutásai

![Lekérdzés](lekerdezes.jpg)
![Szerkesztés](szerkesztes.jpg)
![Törlés](torles.jpg)

###  9.1. Hardver és hálózati topológia

A felhasználói gépeknek el kell érniük az adatbázis szerverként üzemelő központi gépet, mivel a dolgozók a szoftveren keresztül az itt tárolt adatokat fogják elérni. A cél platformunk a panzió tulajdonában lévő számítógépek melyeknek hardvere 8 GB DDR4 és RAM-ból, egy Intel Core i7-9750H 2.60GHz típusú processzorból és egy NVIDIA GeForce GTX 1660ti típusú videokártyából állnak. Ezeken Windows 10 operációs renszer fut. A programunk viszont fut linux alapu operációs rendszerek alatt is.

## 10. Fejlesztő eszközök

A projektet Java 14-be készítetük aminek projektmenedzsmentjéhez az Apache Maven használtuk. A grafikus felületet JavaFX 14-be készitetük. A szoftver által használt adatbázis MySQL alapú relációs adatbázis.

## 11. Architekturális terv 

A rendszert felépítő alrendszerek (szoftver komponensek) lényegében a Java, Sql, Mavan használata Java FX keretén belül. Az alrendszerek meghatározása után a tulajdonságaikat kiaknázva vezérlési, valamint kommunikációs kapcsolatokat lehet létrehozni ez által. Ezeknek a komponenseknek és a köztük fennáló kapcsolatok alkotják a szoftver architekturáját. A rendszer szerepe az érdekelt szereplő kommunikációjának lehetővé tétele, a korai fejlesztési fázisok döntéseinek támogatása. Emellet fontos újrafelhasználhatóság elősegítése. Ennek meghatározásában nagy szerepet játszik a környezet, a fejlesztők céljai és stratégiája által befolyásolt követelmények. De mint minden tervnek ennek is megvannak a meghatározó pillérji:

* Architektúrát meghatározó fejlesztő szervezet szerkezetéből
* Szereplők
* Követelmények
* Technológiai környezet
* A tervező tapasztalata
  
Architektúra elemek:

* Architektúrális minta
   * típus elemek és kapcsolatok, kényszerek
   * pl. kliens-szerver minta
*  Referencia modell
   * standard funkcionális felosztás és adatfolyam megoldások
   * pl. adatbázis kezelő rendszer
* Referencia architektúra
   * referencia modell leképezése szoftver elemekre
   * pl. ISO OSI architektúra

### 11.1. Rendszer bővíthetősége  

A rendszert teljesen objektum orientált szemlélet szerint kerül implementálásra vagyis a rendszer egy bizonyos szinten alkalmas lesz a bővítésre.

### 11.2. Biztonsági funkciók 

A szoftverben biztonsági funkciók implementálását nem terveztük.

### 11.3. Adatbázis terv

Az alkalmazásunk egy MySQL alapú adatbázistfog kezelni. Ez az adatbázis egy táblából, a Vendeg táblából fog állni. Ez a tábla tartalmazni fogja a vendégek nevét, telefonszámát, email címét, a szoba kivételének dátumát, a szoba elhagyasának dátumát, a szoba típusát(1, 2 vagy 3 ágyas) illetve a vendég által fizetendő összeget.

### 12.4. Logikai adatmodell  

![ER Diagram](ERD.jpg)

   Oszlopok         |Tárolt adat |
   ----------------|-------------------------  |
   ID int(1000), Primary key, Foringe key| Vendég azonosító |       
   Nev   varchar(255)|Vendég neve|                      
   Telefonszám int(50)|Vendég telefonszáma|             
   email varchar(255)|Vendég email címe|
   SzobaKivetele date|Szoba kivételének dátuma|                   
   SzobaElhagyasa date|Szoba elhagyásának dátuma|
   SzobaTipusa varchar(255)|Szoba típusa (1, 2 vagy 3 ágyas)|
   FizetendoOsszeg int(50)|Vendég által fizetendő összeg|     

## 14. Tesztterv  

Kód|Leírás|  
----|---  
T01| A program elindítása.|
T02| A teljes adatbázis lekérdezése.|
T03| Keresés az adatbázisban megadot érték szerint.|
T04| Új vendég hozzáadása az adatbázishoz.|
T05| Az adatbazis rekordjainak módosítása.|
T06| Vendég törlése.|
T07| Típushiba kezelésének tesztelése.|
T08| Grafikus felulet reszponzivításának tesztelése.|