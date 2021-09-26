# spring_boot_doker_DinningRoom
In repozitoriul respectiv se afla aplicatia scrisa pe spring Boot care contine logica de constructie a serverului DinningRoom, unde initial in calitate de entitate exista Order
si logica de creare a obiectului de tip order. Prin intermediul anotatiei : @RequestMapping(method=RequestMethod.POST, value("/distribution") aplicatia transmite un scurt mesaj catre serverul Kitchen ("You recieved a new order!!!"). prin intermediul Doker a fost creat initial docker image dupa care docker container, in care a fost impachetata aplicatia.
