/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author aaqib
 */
public class TestBST { 

    public static void main(String[] args) {
        
//        BST bst=new BST();
//        Node root=null;
//        root=bst.insert(root, 50);
//        bst.insert(root, 30);
//        bst.insert(root, 20);
//        bst.insert(root, 40);   
//        bst.insert(root, 70);
//        bst.insert(root, 60);
//        bst.insert(root, 80);
//        
//        bst.search(root, 20);
//        bst.search(root, 50);
//        bst.search(root, 30);
//        bst.search(root, 70);
//        bst.search(root, 60);
//        bst.search(root, 80);
//        bst.search(root, 100); 
StringInsert st=new StringInsert();
Node root=null;
root=st.insert(root, "AAQIB");
st.insert(root, "ALIHamzaaaaa");
st.insert(root, "ALI");
st.search(root, "ALI");
st.search(root, "ALIHamzaaaaa");
st.search(root, "AAQIB");
st.search(root, "AAQIBJAVED");

        
        
            }
    
}
