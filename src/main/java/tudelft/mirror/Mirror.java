package tudelft.mirror;

public class Mirror {

/**
 * Find the substring of a string that's mirrored from it's end.
 * 
 * Find zero or more characters at the very begining of the given string, 
 * and at the very end of the string in reverse order (possibly overlapping)
 *
 * For example: mirrorEnds("abXYZba") returns "ab"
 * For example: mirrorEnds("abXXXba") returns "abXXXba"
 *
 *
 * @param string    non-null String
 * 
 * @return the substring of the string that's mirrored from it's end
 */
    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }

        return begin == end || begin == end + 1 ? string : mirror;
    }
}

