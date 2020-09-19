## 9. Rendszerhasználati esetek és lefutásai

![Lekérdzés](lekerdezes.jpg)

![Szerkesztés](szerkesztes.jpg)

![Törlés](torles.jpg)

###  9.1. Hardver és hálózati topológia
A felhasználói gépeknek el kell érniük az adatbázis szerverként üzemelő központi gépet, mivel a dolgozók a szoftveren keresztül az itt tárolt adatokat fogják elérni. A cél platformunk a panzió tulajdonában lévő számítógépek melyeknek hardvere 8 GB DDR4 és RAM-ból, egy Intel Core i7-9750H 2.60GHz típusú processzorból és egy NVIDIA GeForce GTX 1660ti típusú videokártyából állnak. Ezeken Windows 10 operációs renszer fut. A programunk viszont fut linux alapu operációs rendszerek alatt is.

## 10. Fejlesztő eszközök

A projektet Java 14-be készítetük aminek projektmenedzsmentjéhez az Apache Maven használtuk. A grafikus felületet JavaFX 14-be készitetük. A szoftver által használt adatbázis MySQL alapú relációs adatbázis.