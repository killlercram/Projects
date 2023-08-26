//Basic Bank Management System
//Class Project
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int List ();
void Diposite ();
void Withdraw ();
void Transfer ();
void CheckDetails ();
void Last ();


int Total_Amount = 0, Amount;
int Amt_WithDraw, Total_Deposited = 0, Total_WD = 0, Total_trf = 0;
int Trf;
int Acc;
char name[50];
void
main ()
{
  system ("clear");
  printf ("\nEnter Your Name: ");
  gets (name);
  printf ("\n Enter your Account Number: ");
  scanf ("%d", &Acc);

  while (1)
    {
      system ("clear");
      switch (List ())
	{
	case 1:
	  Diposite ();
	  Total_Deposited += Amount;
	  break;

	case 2:
	  Withdraw ();
	  if (Amt_WithDraw <= Total_Amount)
	    {
	      Total_WD += Amt_WithDraw;
	    }
	  break;

	case 3:
	  Transfer ();
	  if (Trf <= Total_Amount)
	    {
	      Total_trf += Trf;
	    }
	  break;

	case 4:
	  CheckDetails ();
	  break;

	case 5:
	  system ("clear");
	  Last ();
	  exit (0);

	default:
	  printf ("\nInvalid Choice:");
	}
    }

}


int
List ()
{
  int ch;
  printf ("\n1. Diposite Amount: ");
  printf ("\n2. Withdraw Amount: ");
  printf ("\n3. Transfer Amount: ");
  printf ("\n4. Check details: ");
  printf ("\n5. Exit: ");
  printf ("\nEnter your choice:  ");
  scanf ("%d", &ch);
  return (ch);
}

void
Diposite ()
{
  printf ("\nEnter the Amount you want to depostie:");
  scanf ("%d", &Amount);
  Total_Amount += Amount;
}

void
Withdraw ()
{
  printf ("\nEnter the Amount you want to Withdraw:");
  scanf ("%d", &Amt_WithDraw);
  if (Amt_WithDraw <= Total_Amount)
    {
      Total_Amount -= Amt_WithDraw;
    }
  else
    {
      printf ("\nInsufficient Balance:");
    }
}

void
Transfer ()
{
  printf ("\nEnter the Amount you want to Transfer:");
  scanf ("%d", &Trf);
  if (Trf <= Total_Amount)
    {
      Total_Amount -= Trf;
    }
  else
    {
      printf ("\nInsufficient Balance:");
    }

}

void
CheckDetails ()
{
  printf ("\n Total Amount=%d", Total_Amount);
  printf ("\n Total deposited Amount=%d", Total_Deposited);
  printf ("\n Total withdrawn Amount=%d", Total_WD);
  printf ("\n Total transfered Amount=%d", Total_trf);
}

void
Last ()
{
  printf ("\n*************************************************\n");
  printf ("\nName=%s ", name);
  printf ("\nAccount Number=%d ", Acc);
  printf ("\n Total Amount=%d", Total_Amount);
  printf ("\n Total deposited Amount=%d", Total_Deposited);
  printf ("\n Total withdrawn Amount=%d", Total_WD);
  printf ("\n Total transfered Amount=%d", Total_trf);
  printf ("\n\n**********Thank You*********\n\n");
}
