class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       String temp = "";
		for (int i = 0; i < ransomNote.length(); i++)
		{
			for (int j = 0; j < magazine.length(); j++)
			{
				if (String.valueOf(ransomNote.charAt(i)).equals(String.valueOf(magazine.charAt(j))))
				{
					temp = temp.concat(String.valueOf(ransomNote.charAt(i)));
				    magazine=magazine.substring(0, j) + '-' + magazine.substring(j + 1);
					break;
				}
			}
		}

		if (temp.equals(ransomNote))
			return true;
		return false;
    }
}