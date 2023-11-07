from datetime import date
from dateutil.relativedelta import relativedelta

def solution(today, terms, privacies):
    answer = []
    
    y, m, d = map(int, today.split("."))
    today = date(y, m, d)
    terms = {term[0] : int(term[2:]) for term in terms}
    
    for i, privacy in enumerate(privacies):
        collect_date, term = privacy.split()
        y, m, d = map(int, collect_date.split("."))
        collect_date = date(y, m, d)
        
        expired_date = collect_date + relativedelta(months=terms[term])
        if expired_date <= today: answer.append(i + 1)
    
    return answer