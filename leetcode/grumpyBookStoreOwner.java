class grumpyBookStoreOwner {
    public int maxSatisfied(int[] c, int[] grumpy, int minutes) {
        int grumpySub =0;
        for(int i=0;i<minutes;i++)
        {
            if(grumpy[i]==1)
            {
                grumpySub+=c[i];
            }
        }
        int maxi = grumpySub;
        for(int y=minutes;y<grumpy.length;y++)
        {
            grumpySub+=c[y]*grumpy[y];
            grumpySub-=c[y-minutes]*grumpy[y-minutes];
            maxi = Math.max(grumpySub , maxi);
        }
        for(int i=0;i<c.length;i++)
        {
            if(grumpy[i]!=1)
            {
                maxi+=c[i];
            }
        }
        return maxi;
    }
}