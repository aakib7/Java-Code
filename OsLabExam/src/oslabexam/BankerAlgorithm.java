/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oslabexam;

/**
 *
 * @author aaqib
 */
public class BankerAlgorithm {
public void calculateNeed(int P,int R,int need[][], int maxm[][],int allot[][])
{
    
    for (int i = 0 ; i < P ; i++)
        for (int j = 0 ; j < R ; j++)
            need[i][j] = maxm[i][j] - allot[i][j];
}
  
public boolean isSafe(int P,int R,int processes[], int avail[], int maxm[][],
            int allot[][])
{
    int [][]need = new int[P][R];
    calculateNeed(P,R,need, maxm, allot);

    boolean []finish = new boolean[P];
  
    int []safeSeq = new int[P];
    int []work = new int[R];
    for (int i = 0; i < R ; i++)
        work[i] = avail[i];
    int count = 0;
    while (count < P)
    {
    
        boolean found = false;
        for (int p = 0; p < P; p++)
        {
            if (finish[p] == false)
            {
                int j;
                for (j = 0; j < R; j++)
                    if (need[p][j] > work[j])
                        break;
                if (j == R)
                {
            
                    for (int k = 0 ; k < R ; k++)
                        work[k] += allot[p][k];
                   
                    safeSeq[count++] = p;
                    finish[p] = true;
                    found = true;
                }
            }
        }
        if (found == false)
        {
            System.out.print("System is not in safe state");
            return false;
        }
    }
  
    System.out.print("System is in safe state.\nSafe" + " sequence is: ");
    for (int i = 0; i < P ; i++)
        System.out.print(safeSeq[i] + " ");
  
    return true;
}}
