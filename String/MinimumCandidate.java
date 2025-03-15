//Question:- There is company which want to recruit for a job role which require a particular set of skills, you are given a string req_skills in which ith character of req_skills contains ith skill. You are also given an array of string candidate where candidate i is the skills of ith candidate. Return a list containing positions of candidate to form a team of minimum candidates which full fill all the required skills given that all characters in req_skills are unique and candidate[i] only contains skills from req_skills.

// Example:- req_skills = "abcd"
// Candidate = [ [ab], [bc] , [cd], [c] ]
// Output:- [0,2]

package String;

import java.util.*;

public class MinimumCandidate {
    public static List<Integer> smallestSufficientTeam(String req_skills, List<String> candidates) {
        int n = req_skills.length();
        int target = (1 << n) - 1;
        Map<Character, Integer> skillIndex = new HashMap<>();
        
        // Mapping skills to bit positions
        for (int i = 0; i < n; i++) {
            skillIndex.put(req_skills.charAt(i), i);
        }
        
        int[] candidateSkills = new int[candidates.size()];
        for (int i = 0; i < candidates.size(); i++) {
            for (char skill : candidates.get(i).toCharArray()) {
                candidateSkills[i] |= (1 << skillIndex.get(skill));
            }
        }
        
        List<Integer> result = new ArrayList<>();
        backtrack(0, 0, new ArrayList<>(), candidateSkills, target, result);
        return result;
    }
    
    private static void backtrack(int index, int skills, List<Integer> team, int[] candidateSkills, int target, List<Integer> result) {
        if (skills == target) {
            if (result.isEmpty() || team.size() < result.size()) {
                result.clear();
                result.addAll(team);
            }
            return;
        }
        
        if (index == candidateSkills.length) return;
        
        // Include current candidate
        team.add(index);
        backtrack(index + 1, skills | candidateSkills[index], team, candidateSkills, target, result);
        team.remove(team.size() - 1);
        
        // Exclude current candidate
        backtrack(index + 1, skills, team, candidateSkills, target, result);
    }
    
    public static void main(String[] args) {
        String req_skills = "abcd";
        List<String> candidates = Arrays.asList("ab", "bc", "cd", "c");
        System.out.println(smallestSufficientTeam(req_skills, candidates));
    }
}
