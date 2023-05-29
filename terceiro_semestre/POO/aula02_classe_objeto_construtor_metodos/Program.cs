using aula02_classe_objeto_construtor_metodos;

Livro livroBD = new Livro(1234, "767788", "Banco de dados filosófico", 240);


livroBD.Preco = 240;

Show(livroBD.Id + "-" + livroBD.Isbn + "-" + livroBD.Preco);

Show("Digite algo:");
string  returno = Console.ReadLine();


void Show(string msg){
    Console.WriteLine(msg);
}