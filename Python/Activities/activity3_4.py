player1=input("enter name of player1")
player2=input("enter name of player2")

player1_choice=input("enter your choice between rock, paper and scissors for player1").lower()
player2_choice=input("enter your choice between rock, paper and scissors for player2").lower()

while True: 
    if player1_choice==player2_choice:
        print("It's a tie")
    elif player1_choice=='rock':
        if player2_choice=='scissors':
            print(f"{player1} wins")
        else:
            print(f"{player2} wins")

    if player1_choice==player2_choice:
        print("It's a tie")
    elif player1_choice=='scissors':
        if player2_choice=='paper':
            print(f"{player1} wins")
        else:
            print(f"{player2} wins")

    if player1_choice==player2_choice:
        print("It's a tie")
    elif player1_choice=='paper':
        if player2_choice=='rock':
            print(f"{player1} wins")
        else:
            print(f"{player2} wins")

    play_again=input("Do u want to play again").lower()
    if play_again== 'Y' or play_again=='Yes':
        pass
    else:
        break

print("Thanks for playing")