#include<stdio.h>
#include<stdlib.h>
#include<math.h>

#define MAX(a,b) ((a>b)? a: b)
#define MIN(a,b) ((a<b)? a: b)

typedef struct _node{
    struct _node *left;
    struct _node* right;
    int data;
    int height;
}Node;

typedef struct _avl{
    Node* root;
    int len;
}AVL;

int height(Node* root)
{
    if(root!=NULL)
        return root->height;
    else
        return 0;
}
Node* createNode(int data)
{
    Node* td = (Node*)malloc(sizeof(Node));
    td -> data = data;
    td->left = td->right = NULL;
    td->height = 1;
    return td;
}

AVL createAvl()
{
    AVL* avl = (AVL*)malloc(sizeof(AVL));
    avl -> root = NULL;
    avl->len=0;
}

Node* leftRotate(Node* root)
{
    Node* a = root;
    Node* b = root->right;
    a->right = b->left;
    b->left = a;
    a->height = MAX(height(a->left),a->right)+1;
    b->height = MAX(height(b->left) , height(b->right))+1;
    return b;
}

Node* rightRotate(Node* root)
{
    Node* a = root;
    Node* b = root->left;
    a->left = b->right;
    b->right = a;
    a->height = MAX(height(a->left),a->right)+1;
    b->height = MAX(height(b->left) , height(b->right))+1;
    return b;
}

Node* insertNode(Node* root , int data)
{
    if(root == NULL)
        return createNode(data);
    else if(data < root->data)
    {
        root->left = insertNode(root->left,data);
    }
    else if(data>root->data)
    {
        root->right = insertNode(root->right,data);
    }
    root->height = (MAX(height(root->left),height(root->right))+1);
    int bf = height(root->left)-height(root->right);
    if(bf>1)
    {
        if(root->left->data < data )
        {
            //LR IMBALANCE
            root->left = leftRotate(root->left);
            root = rightRotate(root);
        }
        else if(root->left->data > data)
        {
            //LL IMBALANCE
            root = rightRotate(root);
        }
    }
    else if(bf<-1)
    {
        if(root->right->data > data)
        {
            //RL IMBALANCE
            root->right = rightRotate(root->right);
            root = leftRotate(root);
        }
        else if(root->right->data < data)
        {
            //RR IMBALANCE
            root= rightRotate(root);
        }

    }
    return root;
}

Node* deleteNode(Node* root , int data)
{
    if(root==NULL)
    {
        return root;
    }
    if(data<root->data)
    {
        root->left = deleteNode(root->left , data);
    }
    else if(data > root->data)
    {
        root->right = deleteNode(root->right , data);
    }
    else{
        // this means the value is found so checking if it has only one child to return the other else we have to find the inorder successpr and replace it
        if(root->right ==NULL)
        {
            return root->left;
        }
        else if(root->left == NULL)
        {
            return root->right;
        }
        else{
            Node *parent = root;
            Node *child = root->right;
            while(child->left != NULL)
            {
                parent = child;
                child = child->left;
            }
            root->data = child->data;
            root->right = deleteNode(root->right , root->data);
        }


    }
    root->height = (MAX(root->left,root->right)+1);
    int bf = height(root->left)-height(root->right);
    if(bf>1)
    {
        if(root->left->data < data )
        {
            //LR IMBALANCE
            root->left = leftRotate(root->left);
            root = rightRotate(root);
        }
        else if(root->left->data > data)
        {
            //LL IMBALANCE
            root = rightRotate(root);
        }
    }
    else if(bf<-1)
    {
        if(root->right->data > data)
        {
            //RL IMBALANCE
            root->right = rightRotate(root->right);
            root = leftRotate(root);
        }
        else if(root->right->data < data)
        {
            //RR IMBALANCE
            root= rightRotate(root);
        }

    }
    return root;
}

void levelorder(AVL *avl)
{   
     Node* q[avl->len];
     int n = avl->len;
     int qlen = 1;
     int front =0;
     int ind=0;
     q[ind] = avl->root;
     Node* temp = q[front];
     while(qlen > 0)
     {
        temp=q[front];
        printf("%d " ,temp->data );
        if(temp->left!=NULL)
        {
            q[++ind] = temp->left;
            qlen++;
        }
        if(temp->right!=NULL)
        {
            q[++ind] = temp->right;
            qlen++;
        }
        front = (front+1)%n;
        qlen--;
     }
}
int main()
{

}