class Solution {
private:
    // Days in each month for a standard non-leap year
    const vector<int> daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

public:
    int dateToDay(const string& dateStr) {
        int month = stoi(dateStr.substr(0, 2));
        int day = stoi(dateStr.substr(3, 2));
        int absoluteDay = 0;
        for (int i = 0; i < month - 1; ++i) {
            absoluteDay += daysInMonth[i];
        }
        return absoluteDay + day;
    }

    int countDaysTogether(string arriveAlice, string leaveAlice, string arriveBob, string leaveBob) {
        int startA = dateToDay(arriveAlice);
        int endA = dateToDay(leaveAlice);
        int startB = dateToDay(arriveBob);
        int endB = dateToDay(leaveBob);
        int overlapStart = max(startA, startB);
        int overlapEnd = min(endA, endB);
        return max(0, overlapEnd - overlapStart + 1);
    }
};