def contar_a(string):
    string_lower = string.lower()
    count = string_lower.count('a')
    return count




def main():

    texto = input("Digite uma string: ")

    quantidade = contar_a(texto)

    if quantidade > 0:
        print(f"A letra 'a' aparece {quantidade} vezes na string.")
    else:
        print("A letra 'a' não aparece na string.")


if __name__ =="__main__":
    main()